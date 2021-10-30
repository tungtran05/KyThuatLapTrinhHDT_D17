/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachgiangvientheobomon;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> arr = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            GiangVien gv = new GiangVien(i, sc.nextLine(), sc.nextLine());
            arr.add(gv);
        }
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0) {
            String bomon = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON " + xuly(bomon) + ":");
            for(GiangVien gv : arr) {
                if(gv.getBomon().equals(bomon))
                    System.out.println(gv);
            }
        }
    }
    
    public static String xuly(String bomon) {
        String r = "";
        String arr[] = bomon.split(" ");
        for(String str : arr) {
            r += Character.toUpperCase(str.charAt(0));
        }
        
        return r;
    }
}
