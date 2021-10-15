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
public class DSA06024_SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j <= n; j++) {
                if (a[min_index] > a[j]) {
                    min_index = j;
                }
            }

            int tmp = a[min_index];
            a[min_index] = a[i];
            a[i] = tmp;

            System.out.print("Buoc " + i + ":");
            for (int k = 1; k <= n; k++) {
                System.out.print(" " + a[k]);
            }
            System.out.println();

        }
    }
}
