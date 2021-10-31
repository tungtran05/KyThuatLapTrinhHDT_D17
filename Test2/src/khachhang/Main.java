/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList();
        for(int i=1; i<=n; i++ ) {
            KhachHang kh = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(kh);
        }
        
        Collections.sort(arr);
        for(KhachHang kh : arr)
            System.out.println(kh);

        
    }
    
    public static String chuanhoa(String ten) {
        String[] arr = ten.trim().toLowerCase().replaceAll("[ ]+", " ").split(" ");
        String kq = "";
        for(String str : arr) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            kq += str + " ";
        }
        
        return kq.trim();
    }
}
