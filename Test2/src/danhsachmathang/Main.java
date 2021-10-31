/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachmathang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList();
        for(int i=1; i<=n; i++) {
            MatHang mh = new MatHang(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), 
                Long.parseLong(sc.nextLine()));
            arr.add(mh);
        }
        
        Collections.sort(arr);
        for(MatHang mh : arr)
            System.out.println(mh);
    }
}
