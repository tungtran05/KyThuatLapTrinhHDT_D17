package tinhthunhapgiaovien;

public class GiaoVien {
    private String ma, ten, chucvu;
    private long hesobacluong, luong, phucap, thunhap;

    public GiaoVien(String ma, String ten, long luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
        this.hesobacluong = Long.parseLong(ma.substring(2));
        this.chucvu = ma.substring(0, 2);
        if(chucvu.equals("HT")) this.phucap = 2000000;
        else if(chucvu.equals("HP")) this.phucap = 900000;
        else if(chucvu.equals("GV")) this.phucap = 500000;
        else this.phucap = 0;
        this.thunhap = this.luong * this.hesobacluong + phucap;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hesobacluong + " " + phucap + " " + thunhap;
    }
    
    
}
