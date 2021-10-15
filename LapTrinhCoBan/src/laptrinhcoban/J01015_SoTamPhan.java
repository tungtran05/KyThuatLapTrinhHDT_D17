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
public class J01015_SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String str = sc.nextLine();
            boolean check = false;
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2') {
                    check = true;
                } else {
                    check = false;
                }
            }
            
            if(check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
