/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

import java.util.*;


public class DemThanhPhanLienThong {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[20001];
    static boolean chuaxet[] = new boolean[20001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        for(int i=0; i<20001; i++) {
            dske[i] = new ArrayList();
            chuaxet[i] = true;
        }
        int a, b;
        for(int i=1; i<=m; i++) {
            a = sc.nextInt(); b = sc.nextInt();
            dske[a].add(b); dske[b].add(a);
        }
        
        
        for(int j=1; j<=n ;j++) {
            int dem = 0;
            for(int i=0; i<20001; i++) {
                chuaxet[i] = true;
            }
            
            chuaxet[j] = false;
            
            for(int i=1; i<=n; i++) {
                if(chuaxet[i]) {
                    dem++;
                    dfs(i);
                }
            }
            System.out.println(dem);
        }
        
        
    }
    
    static public void dfs(int u) {
        chuaxet[u] = false;
        for(Integer x : dske[u]) {
            if(chuaxet[x]) {
                chuaxet[x] = false;
                dfs(x);
                
            }
        }
    }
}
