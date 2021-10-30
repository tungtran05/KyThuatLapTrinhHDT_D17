/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachsinhvien1_fake;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SinhVien {
    private String ma;
    private String ten, lop;
    private Date ngaysinh;
    private float diem;

    public SinhVien(int ma, String ten, String lop, String ngaysinh, float diem) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.diem = diem;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh) + 
                " " + String.format("%.2f", diem);
    }
    
    
}
