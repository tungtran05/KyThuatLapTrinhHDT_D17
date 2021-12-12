/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

/**
 *
 * @author Xuan Toog
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class DuongDiTheoDFS {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int truoc[] = new int[1001];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0) {
            n = in.nextInt(); m = in.nextInt();
            int s = in.nextInt();
            for(int i=0; i<1001; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            for(int i=1; i<=m; i++) {
                int u = in.nextInt(), v = in.nextInt();
                dske[u].add(v); dske[v].add(u);
            }
            
            for(int t=1; t<=n; t++) {
                if(t != s) {
                    for(int i=0; i<1001; i++) {
                    chuaxet[i] = true;
                    truoc[i] = 0;
                    }

                    dfs(s);
                    if(chuaxet[t]) {
                        System.out.println("No path");
                    } else {
                        Stack<Integer> st = new Stack();
                        st.push(t);
                        while(st.peek()!=s) {
                            st.push(truoc[st.peek()]);
                        }

                        while(!st.empty()) {
                            System.out.print(st.peek() + " ");
                            st.pop();
                        }
                        System.out.println();
                    }
                }
            }
            
            
            
        }
    }
    
    public static void dfs(int u) {
        chuaxet[u] = false;
        for(Integer v : dske[u]) {
            if(chuaxet[v]) {
                truoc[v] = u;
                dfs(v);
            }
        }
    }
}
