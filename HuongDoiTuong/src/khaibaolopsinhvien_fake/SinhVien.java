/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khaibaolopsinhvien_fake;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SinhVien {
    private String ma, ten, lop;
    private Date ngaysinh;
    private float diem;

    public SinhVien(String ten, String lop, String ngaysinh, float diem) throws ParseException {
        this.ma = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.diem = diem;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh)+" "+
                String.format("%.2f", diem) ;
    }
    
    
}
