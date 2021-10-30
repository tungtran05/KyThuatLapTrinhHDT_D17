/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepketquatuyensinh;

/**
 *
 * @author Xuan Toog
 */
public class ThiSinh implements Comparable<ThiSinh>{
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
        String uutien, d;
        float sub1 = (float) (diemuutien - Math.round(diemuutien));
        float sub2 = (float) (diem - Math.round(diem));
        
        if(sub1==0.0) uutien = Math.round(diemuutien) + "";
        else uutien = String.format("%.1f", diemuutien);
        
        if(sub2==0.0) d = Math.round(diem) + "";
        else d = String.format("%.1f", diem);
        
        return ma + " " + ten + " " + uutien + " " + d + " " + trangthai;
    }

    @Override
    public int compareTo(ThiSinh o) {
        int r = Float.compare(o.diem, diem);
        if(r==0)
            return ma.compareTo(o.ma);
        return r;
    }
    
    
}
