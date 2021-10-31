/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgio;

/**
 *
 * @author Xuan Toog
 */
public class LopHocPhan {
    private GiangVien giangVien = new GiangVien();
    private MonHoc monHoc = new MonHoc();
    private double gio;

    public LopHocPhan(String maGV, String maMH, double gio) {
        giangVien.setMa(maGV);
        monHoc.setMa(maMH);
        this.gio = gio;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    public double getGio() {
        return gio;
    }

    public void setGio(double gio) {
        this.gio = gio;
    }
    
    
}
