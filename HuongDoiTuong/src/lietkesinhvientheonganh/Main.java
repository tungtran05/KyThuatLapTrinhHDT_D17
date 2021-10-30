/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietkesinhvientheonganh;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(n-->0) {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sv);
//            System.out.println(sv);
        }
        
        
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0) {
            String str = sc.nextLine();
            String nganh = "";
            if(str.equalsIgnoreCase("ke toan")) {
                nganh = "DCKT";
                System.out.println("DANH SACH SINH VIEN NGANH KE TOAN:");
            }
            if(str.equalsIgnoreCase("cong nghe thong tin")) {
                nganh = "DCCN";
                System.out.println("DANH SACH SINH VIEN NGANH CONG NGHE THONG TIN:");
            }
            if(str.equalsIgnoreCase("an toan thong tin")) {
                nganh = "DCAT";
                System.out.println("DANH SACH SINH VIEN NGANH AN TOAN THONG TIN:");
            }
            if(str.equalsIgnoreCase("vien thong")) {
                nganh = "DCVT";
                System.out.println("DANH SACH SINH VIEN NGANH VIEN THONG:");
            }
            if(str.equalsIgnoreCase("dien tu")) {
                nganh = "DCDT";
                System.out.println("DANH SACH SINH VIEN NGANH DIEN TU:");
            }
            
            for(SinhVien sv : arr ) {
                if(sv.getNganh().equals(nganh)) {
                    System.out.println(sv);
                }
            }
        }
    }
}


