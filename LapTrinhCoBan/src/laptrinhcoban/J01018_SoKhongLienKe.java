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
public class J01018_SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            String str = sc.nextLine();
            if(devide10(str) && sub2(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean devide10(String str) {
        int sum  = 0;
        for(int i=0; i<str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        
        if(sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean sub2(String str) {
        boolean check = false;
        for(int i=1; i<str.length()-1; i++) {
            int a = str.charAt(i-1) - '0';
            int b = str.charAt(i) - '0';
            int c = str.charAt(i+1) - '0';
            if(Math.abs(b-a)==2 && Math.abs(c-b)==2) {
                check = true;
            }
        }
        
        return check;
    }
}
