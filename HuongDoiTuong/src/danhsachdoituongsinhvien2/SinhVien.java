package danhsachdoituongsinhvien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String ma, ten;
    private Date ngaysinh;
    private String lop;
    private float diem;

    public SinhVien() {
    }

    public SinhVien(int id, String ten, String lop, String ngaysinh, float diem) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = xylyten(ten);
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.lop = lop;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh)
                + " " + String.format("%.2f", diem);
    }
    
    private String xylyten(String input) {
        input = input.trim().replaceAll("[ ]+", " ").toLowerCase();
        String arr[] = input.split(" ");
        
        String result = "";
        for(String s : arr) {
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);  
            result += s + " ";
        }
        
        return result.trim();
    }
    
    
}
