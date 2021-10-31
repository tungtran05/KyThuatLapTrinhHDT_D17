/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachmathang;

/**
 *
 * @author Xuan Toog
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, ten, dvt;
    private long giamua, giaban, gia;

    public MatHang(int ma, String ten, String dvt, long giamua, long giaban) {
        this.ma = "MH" + String.format("%03d", ma);
        this.ten = ten;
        this.dvt = dvt;
        this.giamua = giamua;
        this.giaban = giaban;
        this.gia = giaban-giamua;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+dvt+" "+giamua+" "+giaban+" "+gia;
    }

    @Override
    public int compareTo(MatHang o) {
        int r = Long.compare(o.gia, gia);
        if(r==0) return ma.compareTo(o.ma);
        return r;
    }
    
    
}
