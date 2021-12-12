/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;


import java.util.*;

public class DinhThat {
    static int n, m, u, v;
    static ArrayList<Integer> dske[] = new ArrayList[101];
    static boolean chuaxet[] = new boolean[101];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            u = sc.nextInt(); v = sc.nextInt();
            
            for(int i=0; i<101; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b);
            }
            
            int dem = 0;
            for(int i=1; i<=n; i++) {
                for(int j=1; j<101; j++) {
                    chuaxet[j] = true;
                }
                chuaxet[i] = false;
                bfs(u);
                if(chuaxet[v]) {
                    dem++;
                }
            }
            System.out.println(dem);
        }
    }
    
    static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    q.add(x); chuaxet[x]=false;
                }
            }
        }
    }
}
