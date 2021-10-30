/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class DayConTangDan {
    static int a[], n, x[];
    static ArrayList<String> arr;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int [n+1];
        a = new int [21];
        arr = new ArrayList<>();
        for(int i=1; i<=n; i++) x[i] = sc.nextInt();
        
        quaylui(1);
        Collections.sort(arr);
        for(String s : arr)
            System.out.println(s);
    }
    
    static void quaylui(int i) {
        for(int j=0; j<=1; j++) {
            a[i] = j;
            if(i==n) xuly();
            else quaylui(i+1);
        }
    }
    
    static void xuly() {
        String tmp = "";
        ArrayList<Integer> mang = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(a[i]==1) {
                mang.add(x[i]);
            }
        }
        
        if(tangdan(mang) == true) {
            for(int i=0; i<mang.size(); i++) {
                tmp += mang.get(i) + " ";
            }
        }
        
        if(tmp.length() > 3 && tmp.length()<n*2)
            arr.add(tmp.trim());
        
    }
    
    static boolean tangdan(ArrayList<Integer> mang) {
        boolean kq = true;
        for(int i=0; i<mang.size()-1; i++) {
            if(mang.get(i) > mang.get(i+1)) {
                kq = false;
                break;
            }
                
        }
        return kq;
    }
}
