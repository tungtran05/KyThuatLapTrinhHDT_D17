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
public class T307_ConEch {
    public static void main(String[] args) {
        long f[] = new long[55];
        // đỉnh bậc 1: con ếch có 1 cách nhảy : 1
        // đỉnh bậc 2: con ếch có 2 cách nhảy : 1+1, 2
        // đỉnh bậc 3: con ếch có 4 cách nhảy : 1+1+1, 2+1, 1+2, 3
        // suy ra f[1]=1, f[2]=2, f[3]=4
        f[1] = 1; f[2] = 2; f[3] = 4;
        for(int i=4;i<=50;i++)
            f[i] = f[i-1] + f[i-2] + f[i-3];
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
