/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;


import java.util.*;

public class QuayLaiDinh1 {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[21];
    static boolean chuaxet[] = new boolean[21];
    static int[] truoc = new int[21];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=0; i<21; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b);
            }
            
            HashSet<Integer> set = new HashSet<>();
            bfs(1);
            Stack<Integer> st = new Stack();
            st.push(2);
            while(!st.isEmpty()) {
                if(truoc[st.peek()] != 1) {
                    st.push(truoc[st.peek()]);
                } else {
                    st.push(1);
                    break;
                }
            }
            
            set.addAll(st);
            
            for(int i=0; i<21; i++) {
                chuaxet[i] = true;
            }
            
            bfs(2);
            st = new Stack<>();
            st.push(1);
            while(!st.isEmpty()) {
                if(truoc[st.peek()] != 2) {
                    st.push(truoc[st.peek()]);
                } else {
                    st.push(2);
                    break;
                }
            }
            
            set.addAll(st);
            
            System.out.println(set.size());
        }
    }
    
    public static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    q.add(x); chuaxet[x] = false; truoc[x] = tmp;
                }
            }
        }
    }
}
