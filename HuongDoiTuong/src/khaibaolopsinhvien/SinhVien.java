/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khaibaolopsinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + String.format("%.2f", gpa);
    }
    
    
}
