/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class J02024_DayConCoTongLe {

    static int a[], b[], n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            a = new int[20];
            b = new int[20];
            n = in.nextInt();
            int x[] = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
            }
            Arrays.sort(x);
            for (int i = 1; i <= n; i++) {
                a[i] = x[n - i];
            }
            quaylui(1);
        }
    }

    public static void quaylui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n) {
                xuly();
            } else { 
                quaylui(i + 1);
            }

        }
    }

    public static void xuly() {
        int tong = 0, i;
        for (i = 1; i <= n; i++) {
            tong += a[i] * b[i];
        }
        if (tong % 2 == 1) {
            for (i = 1; i <= n; i++) {
                if (b[i] == 1) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
