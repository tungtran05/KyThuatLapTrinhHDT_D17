/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;
public class ChuTrinh {
    static int n, m, u , v;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int truoc[] = new int[1001];
    static boolean check = false;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=0; i<1001; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
            dfs(1);
            if(check) {
                Stack<Integer> st = new Stack<>();
                st.push(1);
                while(st.peek() != 1) {
                    st.push(truoc[st.peek()]);
                }
                while(!st.empty()) {
                    System.out.print(st.pop() +  " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }
    
    static void dfs(int u) {
        
        chuaxet[u] = false;
        for(Integer x : dske[u]) {
            if(chuaxet[x]) {
                chuaxet[x] = false; truoc[x] = u;
                dfs(x);
            } else {
                if(x != truoc[u]) {
                    check = true;
                    return;
                }
            } 
        }
    }
}
