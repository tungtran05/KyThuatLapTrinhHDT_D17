/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class TapHopSoNguyen {
    static boolean A[], B[];
    static int a[], b[];
    static int n, m;
    static ArrayList<Integer> giao, atrub, btrua;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        m = sc.nextInt();
        A = new boolean[1000]; B = new boolean[1000];
        a = new int[n]; b = new int[m];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            A[a[i]] = true;
        }
        for(int i=0; i<m; i++) {
            b[i] = sc.nextInt();
            B[b[i]] = true;
        }
      
        giao = new ArrayList<>();
        atrub = new ArrayList<>();
        btrua = new ArrayList<>();
        
        for(int i=0; i<1000; i++) {
            if(A[i] && B[i]) {
                if(n<=m)
                    giao.add(b[i]);
                else 
                    giao.add(a[i]);
                       
            }
        }
        
        for(int i=0; i<giao.size(); i++)
            System.out.print(giao.get(i) + " ");
        System.out.println();
        
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            a1.add(a[i]);
        }
        for(int i=0; i<a1.size(); i++) {
            for(int j=0; j<giao.size(); j++) {
                if(a1.get(i) == giao.get(j))
                    a1.remove(giao.get(j));
            }
        }
        for(int i=0; i<a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
        System.out.println();
        
        ArrayList<Integer> b1 = new ArrayList<>();
        for(int i=0; i<b.length; i++){
            b1.add(b[i]);
        }
        for(int i=0; i<b1.size(); i++) {
            for(int j=0; j<giao.size(); j++) {
                if(b1.get(i) == giao.get(j))
                    b1.remove(giao.get(j));
            }
        }
        for(int i=0; i<b1.size(); i++) {
            System.out.print(b1.get(i) + " ");
        }
        System.out.println();
    }
}
