/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khaibaolopnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class NhanVien {
    private String ma, hoten, gioitinh;
    private Date ngaysinh;
    private String diachi;
    private long masothue;
    private Date ngaykihd;

    public NhanVien(String hoten, String gioitinh, String ngaysinh, String diachi, long masothue, String ngaykihd) throws ParseException {
        this.ma = "00001";
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykihd = new SimpleDateFormat("dd/mm/yyyy").parse(ngaykihd);
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + gioitinh + " " + 
                new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh) + " " + diachi + " "
                + masothue + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaykihd);
    }
    
    
}
