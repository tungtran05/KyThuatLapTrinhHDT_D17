/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lietketxuatnhaphangtheonhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MaHang> arr = new ArrayList<>();
        while(n-->0) {
            MaHang mh = new MaHang(sc.nextLine(), Long.parseLong(sc.nextLine()));
            arr.add(mh);
        }
        
        Collections.sort(arr);
        char c = sc.nextLine().charAt(0);
        for(MaHang mh : arr) {
            if(mh.getMa().charAt(0) == c) {
                System.out.println(mh);
            }
        }
    }
}
