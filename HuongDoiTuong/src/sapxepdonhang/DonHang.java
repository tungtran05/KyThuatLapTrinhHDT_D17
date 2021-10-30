/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepdonhang;


public class DonHang implements Comparable<DonHang>{
    private char maloai;
    private String ten, madon;
    private long dongia, soluong, giamgia, thanhtien;
    private int thutu;

    public DonHang(String ten, String madon, long dongia, long soluong) {
        this.ten = ten;
        this.madon = madon;
        this.dongia = dongia;
        this.soluong = soluong;
        this.maloai = madon.charAt(madon.length()-1);
        if(maloai == '1') giamgia = dongia * soluong * 50 / 100;
        if(maloai == '2') giamgia = dongia * soluong * 30 / 100;
        this.thanhtien = dongia * soluong - giamgia;
        this.thutu = Integer.parseInt(madon.substring(1, 4));
    }

    @Override
    public String toString() {
        return ten + " " + madon + " " + madon.substring(1,4) + " " + giamgia + " " + thanhtien;
    }

    @Override
    public int compareTo(DonHang o) {
        return Integer.compare(thutu, o.thutu);
    }
    
    
}
