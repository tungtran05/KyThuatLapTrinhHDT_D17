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

public class CayKhungCuaDoThiTheoThuatToanBFS {
    static int n, m, u;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static ArrayList<String> res;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt(); u = sc.nextInt();
            for(int i=0; i<1001; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
            res = new ArrayList<>();
            bfs(u);
            if(res.size() == n-1) {
                for(String tmp: res) {
                    System.out.println(tmp);
                }
            } else {
                System.out.println(-1);
            }
        }
    }
    
    static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    res.add(tmp + " " + x);
                    chuaxet[x]=false; q.add(x);
                }
            }
        }
    }
}
