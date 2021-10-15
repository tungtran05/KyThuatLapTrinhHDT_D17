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
public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(long i=1; i<=n; i++) {
            sum += giaiThua(i);
        }
        System.out.println(sum);
    }
    
    public static long giaiThua(long n) {
        if(n==1) return 1;
        long result = n;
        while(n-- > 1) {
            result *= n;
        }
        
        return result;
    }
}
