/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangdoi;

import java.util.*;

/**
 *
 * @author Xuan Toog
 */
public class SoNguyenThuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int count = 0;
            Queue<String> q = new LinkedList<>();
            
            q.add("4"); q.add("5");
            while(count < n) {
                String tmp = q.poll();
                count++;
                
                System.out.print(tmp);
                for(int i=tmp.length()-1; i>=0; i--) {
                    System.out.print(tmp.charAt(i));
                }
                System.out.print(" ");
                
                q.add(tmp + "4");
                q.add(tmp + "5");
            }
            System.out.println();
        }
    }
}
