/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopphanso;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class PhanSo {
    private long tu, mau;
    public PhanSo() {
    }
    public PhanSo(String s) {
        String arr[] = s.split(" ");
        tu = Long.parseLong(arr[0]);
        mau = Long.parseLong(arr[1]);
    }
    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long uscln(long a, long b) {
        if(b==0) return a;
        return uscln(b, a%b);
    }
    public void rutgon() {
        long x = uscln(tu, mau); tu /= x; mau /= x;
    }
    public PhanSo nhan(PhanSo other) {
        PhanSo kq = new PhanSo();
        kq.tu = tu * other.tu;
        kq.mau = mau * other.mau;
        kq.rutgon();
        return kq;
    }
    public PhanSo cong(PhanSo other) {
        PhanSo kq = new PhanSo();
        kq.tu = tu*other.mau + mau*other.tu;
        kq.mau = mau * other.mau;
        kq.rutgon();
        return kq;
    }
    @Override
    public String toString() {
        return tu+"/"+mau;
    }
    
    
}
