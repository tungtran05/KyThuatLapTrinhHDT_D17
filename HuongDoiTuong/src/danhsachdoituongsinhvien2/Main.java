package danhsachdoituongsinhvien2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList();
        for(int i=1; i<=n; i++) {
            SinhVien sv = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    Float.parseFloat(sc.nextLine()));
            arr.add(sv);
        }
        
        for(SinhVien sv : arr) {
            System.out.println(sv);
        }
    }
}
