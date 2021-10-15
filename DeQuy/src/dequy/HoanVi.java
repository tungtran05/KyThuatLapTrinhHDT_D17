package dequy;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class HoanVi {
    static int a[], n;
    static boolean b[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = new int[20];
        b = new boolean [20];
        int n = sc.nextInt();
        quaylui(1);
    }
    
    public static void quaylui(int i) {
        for(int j=1; j<=n; j++) {
            if(b[j]==false) {
                a[i] = j; b[j] = true;
                if(i == n) in();
                else quaylui(i+1);
                b[j] = false;
            }
        }
    }
    
    public static void in() {
        for(int i=1; i<=n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
