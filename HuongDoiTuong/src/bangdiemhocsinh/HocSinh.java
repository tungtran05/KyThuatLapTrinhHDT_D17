
package bangdiemhocsinh;

public class HocSinh implements Comparable<HocSinh>{
    private int ma;
    private String ten;
    private float diemtb;
    private String xepLoai;
    private float[] diem;
    
    public HocSinh(int ma, String ten, float[] diem) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        this.diemtb = tinhDiemTB(this.diem);
        if(diemtb < 5) xepLoai = "YEU";
        else if(diemtb <= 6.9) xepLoai = "TB";
        else if(diemtb <= 7.9) xepLoai = "KHA";
        else if(diemtb <= 8.9) xepLoai = "GIOI";
        else xepLoai = "XUAT SAC";
    }
    
    public float tinhDiemTB(float diem[]) {
        float result = diem[0] * 2 + diem[1] * 2;
        for(int i=2; i<10; i++) result += diem[i];
        result = result / 12;
        
        result = (float) Math.round(result * 10) / 10;
        
        return result;
    }

    @Override
    public String toString() {
        return "HS" + String.format("%02d", ma) + " " + ten + " " + diemtb
                + " " + xepLoai;
    }

    @Override
    public int compareTo(HocSinh o) {
        int r = Float.compare(o.diemtb, diemtb);
        if(r==0) return Integer.compare(ma, o.ma);
        else return r;
    }
    
    
}
