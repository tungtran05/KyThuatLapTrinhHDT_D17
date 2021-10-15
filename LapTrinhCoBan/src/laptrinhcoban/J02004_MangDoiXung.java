/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcoban;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            int n = sc.nextInt();
            int a[] = new int [n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            
            boolean dx = true;
            for(int i=0; i<n/2; i++) {
                if(a[i] != a[n-i-1]) {
                    dx = false;
                }
            }
            
            if(dx) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
