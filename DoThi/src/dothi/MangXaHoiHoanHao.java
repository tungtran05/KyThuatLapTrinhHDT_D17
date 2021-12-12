/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;


import java.util.*;

public class MangXaHoiHoanHao {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[100001];
    static Set<Integer> set[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            
            n = sc.nextInt(); m = sc.nextInt();
            set = new HashSet[n+1];
            
            for(int i=0; i<=n; i++) {
                set[i] = new HashSet<>();
                dske[i] = new ArrayList<>();
            }
            
            int indexOfSet = 0;
            int a = sc.nextInt(), b = sc.nextInt();
            set[indexOfSet].add(a);  set[indexOfSet].add(b);
            dske[a].add(b); dske[b].add(a);
            for(int i=2; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                int j;
                for(j=0; j<=indexOfSet; j++) {
                    if(set[j].contains(a) || set[j].contains(b)) {
                        set[j].add(a); set[j].add(b);
                        dske[a].add(b); dske[b].add(a);
                        break;
                    }
                }
                if(j==indexOfSet+1) { // nếu ở ngoài mảng set hiện tại thì nhảy sang set mới
                    indexOfSet++;
                    set[indexOfSet].add(a); set[indexOfSet].add(b);
                    dske[a].add(b); dske[b].add(a);
                }
            }
            
            boolean check = true;
            for(int i=0; i<=indexOfSet; i++) {
                for(Integer tmp : set[i]) {
                    if(dske[tmp].size() != set[i].size()-1) {
                        check = false;
                        System.out.println("NO");
                        i = indexOfSet + 1;
                        break;
                    }
                }
            }
            if(check)
                System.out.println("YES");
        }
    }
    
    
}
