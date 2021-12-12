/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;


import java.util.*;
public class DFSTrenDoThiVoHuong {
    static int n, m; // n: so dinh, m: so canh
    static ArrayList<Integer> dske[] = new ArrayList[1001]; // mot mang cac' ArrayList
    static boolean chuaxet[] = new boolean[1001]; // danh dau cac dinh chua xet
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();   m = sc.nextInt();   int u = sc.nextInt();
            for(int i=1; i<=n; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            for(int i=1; i<=m; i++) {
                int a = sc.nextInt(); int b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
            dfs(u);
            System.out.println();
        }
        
    }
    
    public static void dfs(int u) {
        System.out.print(u + " ");
        chuaxet[u] = false;
        for(Integer v : dske[u]) 
            if(chuaxet[v] == true)
                dfs(v);
    }
    
}
