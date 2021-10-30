/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemdanh2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList();
        HashMap<String, SinhVien> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sv);
            map.put(sv.getMa(), sv);
        }
        
        for(int i=0; i<n; i++) {
            String ma = sc.next();
            SinhVien sv = map.get(ma);
            sv.setDiemdanh(sc.next());
            map.replace(ma, sv);
        }
        
        String lop = sc.next();
        for(SinhVien sv : arr) {
            if(sv.getLop().equals(lop))
                System.out.println(map.get(sv.getMa()));;
        }
    }
}
