/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

import java.util.*;

public class LienThong {
    static int n, m, x;
    static ArrayList<Integer> dske[] = new ArrayList[301];
    static boolean chuaxet[] = new boolean[301];
    static TreeSet<Integer> set = new TreeSet<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt(); x = sc.nextInt();
        for(int i=0; i<301; i++) {
            dske[i] = new ArrayList();
            chuaxet[i] = true;            
        }
        
        int a, b;
        for(int i=1; i<=m; i++) {           
            a = sc.nextInt(); b = sc.nextInt();
            dske[a].add(b); dske[b].add(a);
        }
        
        for(int i=1; i<=n; i++) {
            set.add(i);
        }
        bfs(x);
        
        if(set.isEmpty()) {
            System.out.println(0);
        } else {
            for(Integer j : set) {
                System.out.println(j);
            }
        }
        
    }
    
    public static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false; set.remove(u);
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    chuaxet[x] = false; q.add(x); set.remove(x);
                }
            }
        }
    }
}
