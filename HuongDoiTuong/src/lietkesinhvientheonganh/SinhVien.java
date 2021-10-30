/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietkesinhvientheonganh;

/**
 *
 * @author Xuan Toog
 */
public class SinhVien {
    private String ma, ten, lop, email, nganh;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.nganh = "";
        if(ma.contains("DCKT")) this.nganh = "DCKT";
        if(ma.contains("DCCN") && lop.charAt(0) != 'E') this.nganh = "DCCN";
        if(ma.contains("DCAT") && lop.charAt(0) != 'E') this.nganh = "DCAT";
        if(ma.contains("DCVT")) this.nganh = "DCVT";
        if(ma.contains("DCDT")) this.nganh = "DCDT";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    
}
