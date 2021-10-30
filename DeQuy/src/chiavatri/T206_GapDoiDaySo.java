package chiavatri;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class T206_GapDoiDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(tinh(n, k));
        }

    }

    public static int tinh(int n, long k) {
        long x = (long) Math.pow(2, n-1);
        if(k==x) return n;
        if(k<x) return tinh(n-1, k);
        else return tinh(n-1, k-x); // case: k>x2
        
    }
}
