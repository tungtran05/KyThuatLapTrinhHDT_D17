/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

import java.util.*;

/**
 *
 * @author Xuan Toog
 */
public class KiemTraChuTrinh {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int truoc[] = new int[1001];
    static boolean kq = false;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=0; i<1001; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
            kq = false;
            for(int i=1; i<=n; i++) {
                if(chuaxet[i]) {
                    bfs(i);
                    if(kq==true) {
                        break;
                    }
                }
            }
            
            if(kq == false)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
    
    static void bfs(int u) {
        // xét các đỉnh: nếu đỉnh kề nó khác đỉnh trước nó --> có chu trình
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    q.add(x); chuaxet[x] = false; truoc[x] = tmp;
                } else {
                    if(x != truoc[tmp]) {
                        kq = true;
                        return;
                    }
                }
            }
        }
    }
}
