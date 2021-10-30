package dequy;

import java.util.Scanner;

public class TN22_SapXepQuanHau2 {
    static int a[], n=8, kq;
    static boolean b[], cheoxuoi[], cheonguoc[];
    static int[][] matrix;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            matrix = new int[n+1][n+1];
            for(int i=1; i<=n; i++)
                for(int j=1; j<=n; j++)
                    matrix[i][j] = sc.nextInt();
            
            a = new int[20]; 
            b = new boolean[20]; cheoxuoi = new boolean[20]; cheonguoc = new boolean[20];
            kq = 0;
            quaylui(1);
            System.out.println(kq);
        }
    }
    
    public static void quaylui(int i){
        for(int j=1; j<=n; j++) {
            if(!b[j] && !cheoxuoi[i-j+n] && !cheonguoc[i+j-1]) {
                a[i] = j;
                b[j] = true; cheoxuoi[i-j+n] = true; cheonguoc[i+j-1] = true;
                if(i==n) findMax();
                else quaylui(i+1);
                b[j]=false; cheoxuoi[i-j+n]=false; cheonguoc[i+j-1]=false;
            }
        }
    }
    
    public static void findMax() {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += matrix[i][a[i]];
        } 
        kq = Math.max(sum, kq);
    }
}
