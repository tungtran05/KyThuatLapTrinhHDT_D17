/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class DayConTongBangK {
    static int a[], k, n, x[];
    static ArrayList<String> output;
    static boolean exist = false;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt(); k = sc.nextInt();
            x = new int[20];
            a = new int[20];
            int[] tmp = new int[n];
            for(int i=0; i<n; i++) tmp[i] = sc.nextInt();
            
            Arrays.sort(tmp);
            for(int i=1; i<=n; i++) x[i] = tmp[n-i];
            
            quaylui(1);
            if(exist)
                System.out.println();
            else 
                System.out.println(-1);
        }
    }
    
    static void quaylui(int i) {
        for(int j=0; j<=1; j++) {
            a[i] = j;
            if(i==n) xuly();
            else quaylui(i+1);
        }
    }
    
    static void xuly() {
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(a[i]==1) {
                sum += x[i];
                arr.add(x[i]);
            }
        }
        
        if(sum==k) {
            exist = true;
            Collections.sort(arr);
            System.out.print(arr.toString() + " ");
        }
    }
}
