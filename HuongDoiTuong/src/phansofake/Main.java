/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phansofake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps = new PhanSo(sc.nextLong(), sc.nextLong());
        ps.rutgon();
        System.out.println(ps);
        
//        PhanSo p1 = new PhanSo(1,3);
//        PhanSo p2 = new PhanSo(2,5);
//        PhanSo cong = p1.cong(p2);
//        System.out.println(cong);
    }
}
