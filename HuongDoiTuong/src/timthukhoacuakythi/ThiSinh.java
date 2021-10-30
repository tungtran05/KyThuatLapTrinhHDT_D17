/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timthukhoacuakythi;

/**
 *
 * @author Xuan Toog
 */
public class ThiSinh {
    private int ma;
    private String ten, ngaysinh;
    private float diem1, diem2, diem3, tongdiem;

    public ThiSinh(int ma, String ten, String ngaysinh, float diem1, float diem2, float diem3) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongdiem = diem1 + diem2 + diem3;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ngaysinh + " " + tongdiem;
    }

    public float getTongdiem() {
        return tongdiem;
    }
    
    
}
