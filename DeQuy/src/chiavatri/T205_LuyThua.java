package chiavatri;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class T205_LuyThua {
    static int n, k, mod=(int) 1e9+7;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); k = sc.nextInt();
            System.out.println(powMod(n, k));
        }
    }
    
    public static long powMod(int n, int k) {
        if(k==0) return 1;
        long x = powMod(n, k/2);
        if(k%2==0) return x*x%mod;
        else return n*(x*x%mod)%mod;
    }
}
