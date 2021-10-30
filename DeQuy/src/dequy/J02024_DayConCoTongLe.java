/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class J02024_DayConCoTongLe {
    
    static int a[], b[], n;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            a = new int[20]; b = new int[20];
            int tmp[] = new int [n];
            for(int i=0; i<n; i++) tmp[i] = sc.nextInt();
            Arrays.sort(tmp);
            for(int i=1; i<=n; i++) a[i] = tmp[n-i]; 
            quaylui(1);
        }
    }
    
    public static void quaylui(int i) {
        for(int j=0; j<=1; j++) {
            b[i] = j;
            if(i==n) xuly();
            else quaylui(i+1);
        }
    }
    
    public static void xuly() {
        int sum=0;
        for(int i=1; i<=n; i++) {
            sum += b[i] * a[i];
        }
        if(sum%2==1) {
            for(int i=1; i<=n; i++) {
                if(b[i]==1)
                    System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
