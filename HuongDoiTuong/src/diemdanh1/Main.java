/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemdanh1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, SinhVien> map = new HashMap();
        ArrayList<String> arr = new ArrayList();
        for(int i=0; i<n; i++) {
            String ma = sc.nextLine(); String ten = sc.nextLine(); String lop = sc.nextLine();
            SinhVien sv = new SinhVien(ma, ten, lop);
            arr.add(ma);
            map.put(ma, sv);
        }
        
        for(int i=0; i<n; i++) {
            String ma = sc.next();
            SinhVien sv = map.get(ma);
            sv.setDiemdanh(sc.next());
            map.replace(ma, sv);
        }
        
        for(String s : arr) {
            System.out.println(map.get(s));
        }
    }
}
