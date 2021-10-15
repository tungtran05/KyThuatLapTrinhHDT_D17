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
public class TN02_UocSoNguyenToLonNhat {
    private static boolean isPrime(long n) {

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long usntln(long n) {
        long result = n;
        
        if(isPrime(n)) {
            return n;
        }

        long i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                result = i;
                n /= i;
            } else {
                i++;
            }
        }
        if(n>1) {
            result = n;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long n = sc.nextLong();
            System.out.println(usntln(n));
        }
    }
}
