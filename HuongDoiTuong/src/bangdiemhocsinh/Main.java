
package bangdiemhocsinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> arr = new ArrayList();
        
        for(int i=1; i<=n; i++) {
            String ten = sc.nextLine();
            float[] diem = new float[10];
            for(int j=0; j<10; j++) diem[j] = sc.nextFloat();
            String empty = sc.nextLine();
            
            HocSinh hs = new HocSinh(i, ten, diem);
            arr.add(hs);
        }
        
        Collections.sort(arr);
        for(HocSinh hs : arr) {
            System.out.println(hs);
        }
    }
}  
