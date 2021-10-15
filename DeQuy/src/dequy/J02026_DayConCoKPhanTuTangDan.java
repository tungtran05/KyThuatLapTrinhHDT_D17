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
public class J02026_DayConCoKPhanTuTangDan {
    static int a[], c[], n , k;
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            n = in.nextInt(); k = in.nextInt();
            a = new int[n]; c = new int[n];
            for(int i=0; i<n; i++) a[i] = in.nextInt();
            Arrays.sort(a);
            quaylui(1);
        }
    }
    
    public static void quaylui(int i) {
        for(int j=c[i-1]+1; j<=n-k+i; j++) {
            c[i] = j;
            if(i==k) in();
            else quaylui(i+1);
        }
    }
    
    public static void in() {
//        for(int i=1; i<=k; i++) {
//            System.out.print(c[i]+" ");
//        }
//        System.out.println();
        
        for(int i=1; i<=k; i++) {
            System.out.print(a[c[i]-1]+" ");
        }
        System.out.println();
    }
}
