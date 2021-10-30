/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preTest2.lophocphan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Lop> arr = new ArrayList();
        while(n-->0) {
            Lop lop = new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    sc.nextLine());
            arr.add(lop);
            set.add(lop.getNhom());
        }
        
        ArrayList<String> dsgiangvien = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        while(m-->0) {
            ArrayList<Lop> dslop = new ArrayList();
            String tengiangvien = sc.nextLine();
            for(Lop lop : arr) {
                if(lop.getTengiangvien().equals(tengiangvien)) {
                    dslop.add(lop);
                }
            }
            
            Collections.sort(dslop);            
            System.out.println("Danh sach cho giang vien " + tengiangvien + ":");
            for(Lop lop : dslop) {
                System.out.println(lop.getMa() + " " + lop.getTen() + " " + 
                        String.format("%02d", lop.getNhom()));
            }
        }
    }
}
