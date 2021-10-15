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
public class J01004_SoNguyenTo {
    private static boolean isPrime(int n) {
        for(int i=2; i*i<=n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if(isPrime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
