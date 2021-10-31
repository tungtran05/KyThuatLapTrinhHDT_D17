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
public class GiangVien {
    private String ma, ten;
    private double tonggio;

    public GiangVien() {
        
    }
    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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

    public double getTonggio() {
        return tonggio;
    }

    public void setTonggio(double tonggio) {
        this.tonggio = tonggio;
    }

    @Override
    public String toString() {
        return ten+" "+String.format("%.2f", tonggio);
    }
    
    
}
