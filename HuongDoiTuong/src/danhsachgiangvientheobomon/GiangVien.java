/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachgiangvientheobomon;


public class GiangVien {
    private String ma, ten, bomon;

    public GiangVien(int ma, String ten, String bomon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.bomon = bomon;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + xuly(bomon);
    }
    
    public String xuly(String bomon) {
        String r = "";
        String arr[] = bomon.split(" ");
        for(String str : arr) {
            r += Character.toUpperCase(str.charAt(0));
        }
        
        return r;
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

    public String getBomon() {
        return bomon;
    }

    public void setBomon(String bomon) {
        this.bomon = bomon;
    }
    
    
}
