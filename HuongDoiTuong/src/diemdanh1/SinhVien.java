package diemdanh1;

public class SinhVien {
    private String ma, ten, lop;
    private String diemdanh;

    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    private String tinhdiemdanh () {
        int diem = 10;
        for(int i=0; i<diemdanh.length(); i++) {
            if(diemdanh.charAt(i) == 'm') diem -= 1;
            if(diemdanh.charAt(i) == 'v') diem -= 2;
        }
        
        if(diem <= 0)
            return "0 KDDK";
        return diem + "";
    }

    @Override
    public String toString() {
        String cc = tinhdiemdanh();
        return ma + " " + ten + " " + lop + " " + cc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDiemdanh() {
        return diemdanh;
    }

    public void setDiemdanh(String diemdanh) {
        this.diemdanh = diemdanh;
    }
    
    
}
