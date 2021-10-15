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
public class QuayLuiToHop {
    static int n, k, c[] = new int [20];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        quaylui(1);
    }
    
    public static void quaylui(int i) {
        for(int j = c[i-1]+1; j<=n-k+i ; j++) {
            c[i] = j;
            if(i == k) in();
            else quaylui(i+1);
        }
    }
    
    public static void in() {
        for(int i=1; i<=k; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
