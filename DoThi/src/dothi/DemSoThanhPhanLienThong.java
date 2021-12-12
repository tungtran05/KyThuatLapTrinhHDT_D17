/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;


public class DemSoThanhPhanLienThong {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=1; i<=1000; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            for(int i=1; i<=m; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
            int dem = 0;
            for(int i=1; i<=n; i++) {
                if(chuaxet[i]==true) {
                    dem++;
                    bfs(i);
                }
            }
            System.out.println(dem);
        }
    }
    
    static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer i : dske[tmp]) {
                if(chuaxet[i]==true)
                    q.add(i); chuaxet[i] = false;
            }
        }
    }
}
