/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemtuyensinh;

/**
 *
 * @author Xuan Toog
 */
public class ThiSinh {
    private String ma, ten;
    private float toan, ly, hoa, diemuutien, tongdiem, diem;
    private String trangthai;

    public ThiSinh(String ma, String ten, float toan, float ly, float hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(ma.substring(0, 3).equals("KV1")) diemuutien = (float) 0.5;
        else if(ma.substring(0, 3).equals("KV2")) diemuutien = (float) 1.0;
        else if(ma.substring(0, 3).equals("KV3")) diemuutien = (float) 2.5;
        
        this.tongdiem = toan * 2 + ly + hoa;
        this.diem = this.tongdiem + this.diemuutien;
        if(diem>=24) this.trangthai = "TRUNG TUYEN";
        else this.trangthai = "TRUOT";
    }

    @Override
    public String toString() {
        String uutien, td;
        float sub1 = (float) (diemuutien - Math.round(diemuutien));
        float sub2 = (float) (tongdiem - Math.round(tongdiem));
        
        if(sub1==0.0) uutien = Math.round(diemuutien) + "";
        else uutien = String.format("%.1f", diemuutien);
        
        if(sub2==0.0) td = Math.round(tongdiem) + "";
        else td = String.format("%.1f", tongdiem);
        
        return ma + " " + ten + " " + uutien + " " + td + " " + trangthai;
    }
    
    
}
