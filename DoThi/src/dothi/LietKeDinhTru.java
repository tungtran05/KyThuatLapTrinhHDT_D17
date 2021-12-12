/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;


import java.util.*;
public class LietKeDinhTru {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=0; i<1001; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
            // tìm số thành phần liên thông ban đầu
            int init = 0;
            for(int i=1; i<=n; i++) {
                if(chuaxet[i]) {
                    init++;
                    bfs(i);
                }
            }
            
            // xét các đỉnh xem có phải đỉnh trụ không?
            for(int i=1; i<=n; i++) {
                // reset mảng chuaxet
                for(int j=0; j<1001; j++ ) {
                    chuaxet[j] = true;
                }
                chuaxet[i] = false;
                int dem = 0;
                for(int j=1; j<=n; j++) {
                    if(chuaxet[j]) {
                        dem++;
                        bfs(j);
                    }
                }
                
                if(dem > init)
                    System.out.print(i + " ");
                
            }
            System.out.println("");
        }
    }
    
    static public void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    q.add(x); chuaxet[x] = false;
                }
            }
        }
    }
    
}
