/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcoban;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String str = sc.nextLine();
            if(lienke(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean lienke(String str) {
        boolean check = true;
        if(str.length() == 2) {
            if(Math.abs((str.charAt(0) - '0') - (str.charAt(1) - '0')) != 1) {
                check = false;
            }
        } else {
            for(int i=1; i<str.length()-1; i++) {
                int a = str.charAt(i-1) - '0';
                int b = str.charAt(i) - '0';
                int c = str.charAt(i+1) - '0';
                if(Math.abs(b-a) != 1 || Math.abs(c-b) != 1) {
                    check = false;
                }
            }
        }
        
        return check;
    }
}
