/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
    
    public void rutgon() {
        long x = uscln(tu, mau);
        tu /= x;
        mau /= x;
    }
    
    private long uscln(long a, long b) {
        if(b==0) return a;
        else return uscln(b, a%b);
    }
}
