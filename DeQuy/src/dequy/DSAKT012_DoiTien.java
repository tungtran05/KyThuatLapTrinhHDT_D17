package dequy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class DSAKT012_DoiTien {
    static int[] c, a;
    static int n, s, k=1;
    static int kq = 0;
    static boolean run = true;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); s = sc.nextInt();
        a = new int[n+1]; c = new int[n+1];
        for(int i=1; i<=n; i++) a[i] = sc.nextInt();
        
        while(run==true) {
            quaylui(1, n, k);
            if(k<n) k++;
        }
        
        System.out.println(kq);
    }
    
    public static void quaylui(int i, int n, int k) {
        for(int j=1; j<=n; j++) {
            c[i] = a[j];
            if(i==k) {
                in();
//                if(xuly()==true) {
//                    in();
//                    run = false;
//                    kq = k;
//                    break;
//                }
            }
            else quaylui(i+1, n, k);
        }
    }
    
    public static boolean xuly() {
        int sum = 0;
        for(int i=1; i<=k; i++) {
            sum += c[i];
        }
        
        if(sum == s) 
            return true;
        
        return false;
    }
    
    public static void in() {
        for(int i=1; i<=k ; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }
}
