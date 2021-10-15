package dequy;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class TN25_HoanViXauKyTu {
    static int a[], n;
    static boolean b[];
    static String s;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            s = sc.next(); n = s.length();
            a = new int[15]; b = new boolean[15];
            quaylui(1);
            System.out.println();
        }
    }
    
    public static void quaylui(int i) {
        for(int j=1; j<=n; j++) {
            if(b[j]==false) {
                a[i] = j; b[j] = true;
                if(i==n) in();
                else quaylui(i+1);
                b[j] = false;
            }
        }
    }
    
    public static void in() {
        for(int i=1; i<=n; i++) {
            System.out.print(s.charAt(a[i]-1));
        }
        System.out.print(" ");
    }
}
