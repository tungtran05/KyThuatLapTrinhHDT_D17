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
import java.util.*;

public class DuongDiQuaNhieuCanhNhat {
    static int n, m, s, t;
    static ArrayList<Integer> dske[] = new ArrayList[20];
    static boolean chuaxet[] = new boolean[20];
    static int truoc[] = new int[20];
    static TreeSet<Integer> set = new TreeSet<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=0; i<20; i++) {
                dske[i] = new ArrayList<>();
                truoc[i] = 0;
                chuaxet[i] = true;
            }
            int a, b;
            for(int i=0; i<m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
//            int dem = 0;
            set = new TreeSet<>();
            
            for(int i=0; i<n; i++) {
                for(int k=0; k<20; k++) {
                    truoc[k] = 0;
                    chuaxet[k] = true;
                }
                bfs(i);
                
                for(int t=0; t<n; t++) {
                    if(t != i) {
                        if(!chuaxet[t]) {
                            Stack<Integer> st = new Stack();
                            st.push(t);
                            while(st.peek() != i) {
                                st.push(truoc[st.peek()]);
                            }


                            set.add(st.size());

                            while(!st.empty()) {
                                System.out.print(st.pop() + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
            
            System.out.println(set.last() - 1);
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
