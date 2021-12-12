/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

import java.util.ArrayList;
import java.util.Scanner;


public class KiemTraTinhLienThongManh {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=1; i<=n; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b);
            }
            
            // duyệt dfs() từ một đỉnh bất kỳ, nếu đi qua tất cả các đỉnh thì đồ thị liên thông mạnh
            dfs(1);
            boolean check = true;
            for(int i=0; i<chuaxet.length; i++) {
                if(chuaxet[i] == true) {
                    check = false;
                    break;
                }
            }
            
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static void dfs(int u) {
        chuaxet[u] = false;
        for(Integer x : dske[u]) {
            if(chuaxet[x]) {
                chuaxet[x] = false;
                dfs(x);
            }
        }
    }
}
