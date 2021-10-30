/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitoantinhcong;


public class NhanVien {
    private String ma, ten;
    private long luongngay, ngaycong;
    private String chucvu;
    private long tienluong, tienthuong, phucap, thunhap;

    public NhanVien(int ma, String ten, long luongngay, long ngaycong, String chucvu) {
        this.ma = "NV" + String.format("%02d", ma);
        this.ten = ten;
        this.luongngay = luongngay;
        this.ngaycong = ngaycong;
        this.chucvu = chucvu;
        this.tienluong = luongngay * ngaycong;
        if(ngaycong>=25) this.tienthuong = this.tienluong * 20 / 100;
        else if(ngaycong<25 && ngaycong>=22) this.tienthuong = this.tienluong * 10 / 100;
        else tienthuong = 0;
        if(chucvu.equals("GD")) this.phucap = 250000;
        if(chucvu.equals("PGD")) this.phucap = 200000;
        if(chucvu.equals("TP")) this.phucap = 180000;
        if(chucvu.equals("NV")) this.phucap = 150000;
        this.thunhap = tienluong + tienthuong + phucap;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienluong + " " + tienthuong + " " + phucap + " " + thunhap;
    }
    
    
    
}
