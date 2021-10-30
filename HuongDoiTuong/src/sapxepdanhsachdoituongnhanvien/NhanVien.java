/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepdanhsachdoituongnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien> {

    private String ma, hoten, gioitinh, diachi, masothue;
    private Date ngaysinh, ngayky;

    public NhanVien(int id, String hoten, String gioitinh, String ngaysinh, String diachi,
            String masothue, String ngayky) throws ParseException {
        this.ma = String.format("%05d", id);
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.ngayky = new SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + gioitinh + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + diachi + " " + masothue + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(ngayky);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.ngaysinh.compareTo(o.ngaysinh);
    }

}
