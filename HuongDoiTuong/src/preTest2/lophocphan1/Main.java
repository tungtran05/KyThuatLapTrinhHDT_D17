/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preTest2.lophocphan1;

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
        
        ArrayList<String> dsma = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        while(m-->0) {
            ArrayList<Lop> dslop = new ArrayList();
            String ma = sc.nextLine();
            for(Lop lop : arr) {
                if(lop.getMa().equals(ma)) {
                    dslop.add(lop);
                }
            }
            
            Collections.sort(dslop);
            String tenmonhoc = dslop.get(0).getTen();
            System.out.println("Danh sach nhom lop mon " + tenmonhoc + ":");
            for(Lop lop : dslop) {
                System.out.println(String.format("%02d", lop.getNhom()) + " " + lop.getTengiangvien());
            }
        }
    }
}
