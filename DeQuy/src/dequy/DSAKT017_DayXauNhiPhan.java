package dequy;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class DSAKT017_DayXauNhiPhan {
    static long f[] = new long[100];
    
    public static void main(String[] args) {
        f[0] = 0; f[1] = 1;
        for(int i=2; i<=92; i++) f[i] = f[i-2] + f[i-1];
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fiboWord(n,k));
        }
    }
    
    public static char fiboWord(int n, long k) {
        if(n==1) return '0';
        if(n==2) return '1';
        if(k <= f[n-2]) return fiboWord(n-2, k);
        return fiboWord(n-1, k-f[n-2]);
    }
}
