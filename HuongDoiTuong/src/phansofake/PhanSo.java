/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phansofake;


public class PhanSo {
    private long tu, mau;
    
    public PhanSo(){
        
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long uscln(long a, long b) {
        if(b==0) return a;
        else return uscln(b, a%b);
    }
    
    public void rutgon() {
        long x = uscln(tu, mau);
        tu /= x;
        mau /= x;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
    
    public PhanSo cong(PhanSo other) {
        this.rutgon();
        other.rutgon();
        PhanSo r = new PhanSo();
        r.tu = tu*other.mau + mau*other.tu;
        r.mau = mau * other.mau;
        r.rutgon();
        
        return r;
    }
    
    public PhanSo tru(PhanSo other) {
        this.rutgon();
        other.rutgon();
        PhanSo r = new PhanSo();
        r.tu = tu*other.mau - mau*other.tu;
        r.mau = mau * other.mau;
        r.rutgon();
        
        return r;
    }
}
