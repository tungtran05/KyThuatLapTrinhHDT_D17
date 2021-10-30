
package danhsachdoituongnhanvien;

public class NhanVien {
    private String maNhanVien,ten,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKiHopDong;

    public NhanVien(int maNhanVien, String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong) {
        this.maNhanVien = String.format("%05d",maNhanVien);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }
    
    public String toString(){
        return String.format("%s %s %s %s %s %s %s",maNhanVien,ten,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKiHopDong);
    }
}
