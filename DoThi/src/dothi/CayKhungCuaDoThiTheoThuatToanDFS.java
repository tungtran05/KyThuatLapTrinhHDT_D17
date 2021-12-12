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
public class CayKhungCuaDoThiTheoThuatToanDFS {
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
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }

            res = new ArrayList<>();
            dfs(u);
            if(res.size() == n-1) {
                for(String tmp : res) {
                    System.out.println(tmp);
                }
            } else {
                System.out.println(-1);
            }
        } 
    }
    
    static void dfs(int u) {
        chuaxet[u] = false;
        for(Integer x : dske[u]) {
            if(chuaxet[x]) {
                res.add(u + " " + x);
                chuaxet[x] = false;
                dfs(x);
            }
        }
    }
}
