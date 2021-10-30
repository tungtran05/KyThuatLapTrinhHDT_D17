/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quyhoachdong;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class DSAKT110_NhaKhongKeNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt(), a[] = new int[n];
            for(int i=0; i<n; i++) a[i] = sc.nextInt();
            System.out.println(qhd(a, n));
        }
    }
    
    public static int qhd(int[] a, int n) {
        int f[] = new int [n], i, j, kq = 0;
        f[0] = a[0];
        f[1] = Math.max(a[0], a[1]);
        for(i=2; i<n; i++) {
            f[i] = Math.max(f[i-2]+a[i], f[i-1]);
        }
        
        return f[n-1];
    }
}
