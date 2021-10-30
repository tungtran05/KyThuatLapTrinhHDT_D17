/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemtuyensinh;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0) {
            ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), 
                Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            System.out.println(ts);
        }
    }
}
