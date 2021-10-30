/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhluong;


public class NhanVien {
    
    private String ma, ten, phongban;
    private long hesonhan, namcongtac, luongcoban, ngaycong, luongthang;
    
    public NhanVien(String ma, String ten, long luongcoban, long ngaycong) {
        this.ma = ma;
        this.ten = ten;
        this.luongcoban = luongcoban;
        this.ngaycong = ngaycong;
        this.namcongtac = Long.parseLong(ma.substring(1,3));
        
        if(ma.charAt(0)=='A'){
            if(namcongtac>=1 && namcongtac<=3) this.hesonhan = 10;
            else if(namcongtac>=4 && namcongtac<=8) this.hesonhan = 12;
            else if(namcongtac>=9 && namcongtac<=15) this.hesonhan = 14;
            else this.hesonhan = 20;
        }
        if(ma.charAt(0)=='B'){
            if(namcongtac>=1 && namcongtac<=3) this.hesonhan = 10;
            else if(namcongtac>=4 && namcongtac<=8) this.hesonhan = 11;
            else if(namcongtac>=9 && namcongtac<=15) this.hesonhan = 13;
            else this.hesonhan = 16;
        }
        if(ma.charAt(0)=='C'){
            if(namcongtac>=1 && namcongtac<=3) this.hesonhan = 9;
            else if(namcongtac>=4 && namcongtac<=8) this.hesonhan = 10;
            else if(namcongtac>=9 && namcongtac<=15) this.hesonhan = 12;
            else this.hesonhan = 14;
        }
        if(ma.charAt(0)=='D'){
            if(namcongtac>=1 && namcongtac<=3) this.hesonhan = 8;
            else if(namcongtac>=4 && namcongtac<=8) this.hesonhan = 9;
            else if(namcongtac>=9 && namcongtac<=15) this.hesonhan = 11;
            else this.hesonhan = 13;
        }
        
        this.luongthang = luongcoban * ngaycong * hesonhan * 1000;
    }
    
    @Override
    public String toString() {
        return ma+" "+ten+" "+phongban+" "+luongthang;
    }
    
    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    
}
