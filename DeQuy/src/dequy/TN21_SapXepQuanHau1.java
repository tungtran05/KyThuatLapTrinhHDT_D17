package dequy;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class TN21_SapXepQuanHau1 {
    static int a[], n, count;
    static boolean b[], cheoxuoi[], cheonguoc[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            a = new int[20];
            b = new boolean[20]; cheoxuoi = new boolean[20]; cheonguoc = new boolean[20];
            n = sc.nextInt(); count = 0;
            quaylui(1);
            System.out.println(count);
        }
    }
    
    public static void quaylui(int i) {
        for(int j=1; j<=n; j++) {
            if(!b[j] && !cheoxuoi[i-j+n] && !cheonguoc[i+j-1]) {
                a[i] = j;
                b[j]=true; cheoxuoi[i-j+n]=true; cheonguoc[i+j-1]=true;
                if(i==n) count++;
                else quaylui(i+1);
                b[j]=false; cheoxuoi[i-j+n]=false; cheonguoc[i+j-1]=false;
            }
        }
    }
}
