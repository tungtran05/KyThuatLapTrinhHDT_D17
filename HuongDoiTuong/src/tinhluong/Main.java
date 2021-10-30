/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhluong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, String> map = new HashMap<>();
        while(n-->0) {
            String[] arr = sc.nextLine().split(" ", 2);
            map.put(arr[0], arr[1]);
        }
        
        n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        while(n-->0) {
            NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()));
            nv.setPhongban(map.get(nv.getMa().substring(3)));
            a.add(nv);
        }
        
        for(NhanVien nv : a)
            System.out.println(nv);
    }
}
