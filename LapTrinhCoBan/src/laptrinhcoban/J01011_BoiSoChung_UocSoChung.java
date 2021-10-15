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
public class J01011_BoiSoChung_UocSoChung {
    private static long uscln(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return uscln(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long a = sc.nextInt();
            long b = sc.nextInt();

            long uoc = uscln(a, b);
            long boi = a * b / uoc;

            System.out.println(boi + " " + uoc);
        }

    }
}
