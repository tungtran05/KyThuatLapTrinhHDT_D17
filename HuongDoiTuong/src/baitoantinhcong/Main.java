/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitoantinhcong;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(1, sc.nextLine(), Long.parseLong(sc.nextLine()), 
                Long.parseLong(sc.nextLine()), sc.nextLine());
        System.out.println(nv);
    }
}
