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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;


public class BFSTrenDoThiVoHuong_2 {

    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static String res = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt(); m = sc.nextInt();
            int u = sc.nextInt();
            for(int i=1; i<1001; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            for(int i=1; i<=m; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
            res = "BFS(" + u + ") = ";
            
            bfs(u);
            System.out.println(res.substring(0, res.length()-4));
        }

    }
    
    public static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int v = q.poll();
            res += v + " -> ";
            for(Integer i  : dske[v]) {
                if(chuaxet[i] == true) {
                    q.add(i); chuaxet[i] = false;
                }
            }
        }
    }
}
