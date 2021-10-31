/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MonHoc> arrMH = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0) {
            String str[] = sc.nextLine().split(" ", 2);
            MonHoc mh = new MonHoc(str[0], str[1]);
            arrMH.add(mh);
        }
        
        ArrayList<GiangVien> arrGV = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        while(n-->0) {
            String str[] = sc.nextLine().split(" ",2);
            GiangVien gv = new GiangVien(str[0], str[1]);
            arrGV.add(gv);
        }
        
        n = Integer.parseInt(sc.nextLine());
        ArrayList<LopHocPhan> arrLHP = new ArrayList();
        while(n-->0) {
            String str[] = sc.nextLine().split(" ");
            LopHocPhan lhp = new LopHocPhan(str[0], str[1], Double.parseDouble(str[2]));
            arrLHP.add(lhp);
            
            for(GiangVien gv : arrGV) {
                if(gv.getMa().equals(str[0])) {
                    double tonggio = gv.getTonggio();
                    tonggio += Double.parseDouble(str[2]);
                    gv.setTonggio(tonggio);
                }
            }
        }
        
        for(GiangVien gv  : arrGV)
            System.out.println(gv);
    }
}
