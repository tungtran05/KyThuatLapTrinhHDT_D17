/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgio;

import java.util.ArrayList;

/**
 *
 * @author Xuan Toog
 */
public class GiangVien {
    private String ma, ten;
    private double tonggio;
    private ArrayList<MonHoc> arr;

    public GiangVien() {
        
    }
    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getTonggio() {
        return tonggio;
    }

    public void setTonggio(double tonggio) {
        this.tonggio = tonggio;
    }

//    @Override
//    public String toString() {
//        return ten+" "+String.format("%.2f", tonggio);
//    }

    public ArrayList<MonHoc> getArr() {
        return arr;
    }

    public void setArr(ArrayList<MonHoc> arr) {
        this.arr = arr;
    }
    
    @Override
    public String toString() {
        String tmp = "";
        tmp += "Giang vien: " + ten + "\n";
        for(MonHoc mh : arr)
            tmp += mh.toString() + "\n";
        tmp += "Tong: " + String.format("%.2f", tonggio);
        return tmp;
    }
}
