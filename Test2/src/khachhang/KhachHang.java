/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Xuan Toog
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, gioitinh;
    private Date ngaysinh;
    private String diachi;

    public KhachHang(int ma, String ten, String gioitinh, String ngaysinh, String diachi) throws ParseException {
        this.ma = "KH" + String.format("%03d", ma);
        this.ten = chuanhoa(ten);
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
    }
    
    public String chuanhoa(String ten) {
        String[] arr = ten.trim().toLowerCase().replaceAll("[ ]+", " ").split(" ");
        String kq = "";
        for(String str : arr) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            kq += str + " ";
        }
        
        return kq.trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + diachi + " " + 
                new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh);
    }

    @Override
    public int compareTo(KhachHang o) {
        return ngaysinh.compareTo(o.ngaysinh);
    }
    
    
}
