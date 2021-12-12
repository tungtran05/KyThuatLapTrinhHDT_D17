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

public class XoaDanCayKhung {
    
    static int n, m, u, v , tmp;
    static ArrayList<Integer> dske[] = new ArrayList[100001];
    static boolean chuaxet[] = new boolean[100001];
    static int dem[] = new int[100001];
    static int count = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=0; i<106; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
                dem[i] = 0;
            }
            for(int i=1; i<=n-1; i++) {
                u = sc.nextInt(); v = sc.nextInt();
                dske[u].add(v); dske[v].add(u);
            }
            
            count = n;
            for(int j=0; j<m; j++) {
                bfs(1);
                for(int i=1; i<=n; i++) {
                    System.out.print(dem[i] + " ");
                    if(dem[i]==1) {
                        count--;
                    }
                }
                    
            }
            System.out.println(count);
        }
    }
    
    
    static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    q.add(x); chuaxet[x] = false; dem[x]++; dem[tmp]++;
                }
            } 
        }
    }
}
