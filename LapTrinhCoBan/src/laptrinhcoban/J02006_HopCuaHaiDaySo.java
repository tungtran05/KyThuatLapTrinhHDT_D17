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
public class J02006_HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        boolean A[] = new boolean[1000];
        boolean B[] = new boolean[1000];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            A[a[i]] = true;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            B[b[i]] = true;
        }

        for (int i = 0; i < 1000; i++) {
            if (A[i] || B[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
