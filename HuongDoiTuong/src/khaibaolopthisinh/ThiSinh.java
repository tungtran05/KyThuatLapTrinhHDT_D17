/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khaibaolopthisinh;

public class ThiSinh {
    private String hoten, ngaysinh;
    private float d1, d2, d3, tong;

    public ThiSinh(String hoten, String ngaysinh, float d1, float d2, float d3) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1+d2+d3;
    }

    @Override
    public String toString() {
        return hoten + " " + ngaysinh + " " + String.format("%.1f", tong);
    }
    
    
}
