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
public class TN01_SoFibonacci {
    private static long fibonacci(int n) {
        if(n==1 || n==2) {
            return 1;
        }
        
        long f1 = 1, f2 = 1;
        int i = 3;
        long f = 0;
        while(i<=n) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            i++;
        }
        
        return f;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            int n = sc.nextInt();
            System.out.println(fibonacci(n));
        }
    }
}
