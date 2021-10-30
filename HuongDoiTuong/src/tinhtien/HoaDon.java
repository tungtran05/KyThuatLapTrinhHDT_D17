/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtien;

public class HoaDon implements Comparable<HoaDon>{
    private String ma, ten;
    private long soluong, dongia, chietkhau, tongtien;

    public HoaDon(String ma, String ten, long soluong, long dongia, long chietkhau) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
        this.tongtien = dongia * soluong - chietkhau;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soluong + " " + dongia + " " + chietkhau + " " + tongtien;
    }

    @Override
    public int compareTo(HoaDon o) {
        return Long.compare(o.tongtien, tongtien);
    }
    
    
}
