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
public class DSA06025_SapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            // hiển thị a[0]...a[i-1]
            String output = "";
            for (int k = 0; k < i; k++) {
                output += a[k] + " ";
            }
            System.out.println("Buoc " + count + ": " + output.trim());
            count++;

            // các phần tử trong đoạn [0, i-1] nếu lớn hơn key
            // thì dịch 1 vị trí sang phải
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

        }

        String outp = "";
        for (int i = 0; i < n; i++) {
            outp += a[i] + " ";
        }
        System.out.println("Buoc " + count + ": " + outp.trim());

    }
}
