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
public class MonHoc {
    private String ma, ten;private  Double gio;
    
    public MonHoc() {
        
    }

    public MonHoc(String ma, String ten) {
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

    public Double getGio() {
        return gio;
    }

    public void setGio(Double gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return ten + " " + gio;
    }
    
    
}