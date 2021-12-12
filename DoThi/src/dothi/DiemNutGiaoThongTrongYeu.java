/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

import java.util.*;


public class DiemNutGiaoThongTrongYeu {
    // ý tưởng: bỏ đỉnh trọng yếu đi thì số thành phần liên thông của đồ thị tăng lên so với đồ thị ban đầu
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static ArrayList<Integer> dsdinhtru;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            dsdinhtru = new ArrayList<>();
            for(int i=0; i<=1000; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
            }
            
            int init = 0;
            for(int i=1; i<=n; i++) {
                if(chuaxet[i]) {
                    init++;
                    dfs(i);
                }
            }
            
            
            // xét từng đỉnh trong đồ thị
            for(int i=1; i<=n; i++) {
                // reset lại mảng đánh dấu
                for(int j=0; j<1001; j++) {
                    chuaxet[j] = true;
                }
                // đánh dấu đỉnh i
                chuaxet[i] = false;
                // đếm thành phần liên thông...
                int dem = 0;
                for(int j=1; j<=n; j++) {
                    if(chuaxet[j]) {
                        dem++;
                        dfs(j);
                    }
                }
                // nếu số thành phần liên thông > số thành phần liên thông default thì ... 
                if(dem > init)
                    dsdinhtru.add(i);
            }
            
            System.out.println(dsdinhtru.size());
            for(Integer x : dsdinhtru) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    
    public static void dfs(int u) {
        chuaxet[u] = false;
        for(Integer x : dske[u]) {
            if(chuaxet[x]) {
                dfs(x);
            }         
        }
    }
}
