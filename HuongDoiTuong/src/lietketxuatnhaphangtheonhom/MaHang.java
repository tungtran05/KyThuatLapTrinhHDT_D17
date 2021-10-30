/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietketxuatnhaphangtheonhom;


public class MaHang implements Comparable<MaHang>{
    private String ma;
    private long soluongnhap, soluongxuat, dongia, tien, thue;

    public MaHang(String ma, long soluongnhap) {
        this.ma = ma;
        this.soluongnhap = soluongnhap;
        
        if(ma.charAt(0) == 'A') this.soluongxuat = Math.round(soluongnhap * 0.6);
        else this.soluongxuat = Math.round(soluongnhap * 0.7);
        
        if(ma.charAt(4) == 'Y') this.dongia = 110000;
        else this.dongia = 135000;
        
        this.tien = soluongxuat * dongia;
        
        if(ma.charAt(0)=='A' && ma.charAt(4)=='Y') this.thue = Math.round(tien * 0.08);
        else if(ma.charAt(0)=='A' && ma.charAt(4)=='N') this.thue = Math.round(tien * 0.11);
        else if(ma.charAt(0)=='B' && ma.charAt(4)=='Y') this.thue = Math.round(tien * 0.17);
        else this.thue = Math.round(tien * 0.22);
    }

    @Override
    public int compareTo(MaHang o) {
        return Long.compare(o.thue, thue);
    }

    @Override
    public String toString() {
        return ma+" "+soluongnhap+" "+soluongxuat+" "+dongia+" "+tien+" "+thue;
    }

    public String getMa() {
        return ma;
    }
    
    
}
