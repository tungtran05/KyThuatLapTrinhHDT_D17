/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;


import java.util.*;

public class DuongDiCoHuong {
    static int n, m, s, t;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int truoc[] = new int[1001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int s = sc.nextInt(), t = sc.nextInt();
            for(int i=0; i<1001; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b);
            }
            
            bfs(s);
            
            if(chuaxet[t]) {
                System.out.println(-1);
            } else {
                Stack<Integer> st = new Stack<>();
                st.push(t);
                while(st.peek() != s) {
                    st.push(truoc[st.peek()]);
                }
                
                while(!st.empty()) {
                    if(st.size() != 1) {
                        System.out.print(st.pop() + " -> ");
                    } else {
                        System.out.print(st.pop());
                    }
                }
                System.out.println();
            }
        }
    }
    
    public static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    q.add(x); chuaxet[x] = false;
                    truoc[x] = tmp;
                }
            }
        }
    }
}
