/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preTest2.lophocphan2;

/**
 *
 * @author Xuan Toog
 */
public class Lop implements Comparable<Lop>{
    private String ma, ten;
    private int nhom;
    private String tengiangvien;

    public Lop(String ma, String ten, String nhom, String tengiangvien) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = Integer.parseInt(nhom);
        this.tengiangvien = tengiangvien;
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

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public String getTengiangvien() {
        return tengiangvien;
    }

    public void setTengiangvien(String tengiangvien) {
        this.tengiangvien = tengiangvien;
    }

    @Override
    public int compareTo(Lop o) {
        int result = ma.compareTo(o.ma);
        if(result == 0) return Integer.compare(nhom, o.nhom);
        return result;     
    }
    
    
}
