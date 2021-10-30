/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> arr = new ArrayList();
        while(n-->0) {
            HoaDon hd = new HoaDon(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), 
                    Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            arr.add(hd);
        }
        
        Collections.sort(arr);
        for(HoaDon hd : arr)
            System.out.println(hd);
    }
}
