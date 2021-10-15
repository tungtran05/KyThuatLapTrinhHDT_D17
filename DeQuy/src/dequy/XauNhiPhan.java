/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequy;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;
public class XauNhiPhan {
    static int b[], n;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = new int[n+1];
        quaylui(1);
    }
    
    public static void quaylui(int i) {
        for(int j=0; j<=1; j++) {
            b[i] = j;
            if(i == n) in();
            else quaylui(i+1);
        }
    }
    
    public static void in() {
        for(int i=1; i<=n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
