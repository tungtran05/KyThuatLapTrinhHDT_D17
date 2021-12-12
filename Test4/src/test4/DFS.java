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

public class DFS {
    static int n, m, u;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static ArrayList<Integer> res = new ArrayList<>();
    static String kq = "";
    
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
            
//            res = new ArrayList<>();
            kq = "";
            System.out.print("DFS(" + u + ") = ");
            dfs(u);
//            for(int i=1; i<res.size(); i++)
//                System.out.print(" -> " + i);
            System.out.println(kq.substring(0, kq.length()-4));
        }
    }
    
    static void dfs(int u) {
        chuaxet[u] = false;
        kq += u + " -> ";
//        System.out.print(u + " -> ");
        for(Integer x : dske[u]) {
            if(chuaxet[x]) {
                chuaxet[x] = false;
                dfs(x);
            }
        }
    }
}
