/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequy;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class TN10_HoanViNguoc {
    static int a[], n;
    static boolean b[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            a = new int[15]; b = new boolean[15];
            n = sc.nextInt();
            quaylui(1);
            System.out.println();
        }
    }
    
    public static void quaylui(int i) {
        for(int j=n; j>=1; j--) {
            if(b[j]==false) {
                a[i]=j; b[j]=true;
                if(i==n) in();
                else quaylui(i+1);
                b[j] = false;
            }
        }
    }
    
    public static void in() {
        for(int i=1;i<=n; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
}
