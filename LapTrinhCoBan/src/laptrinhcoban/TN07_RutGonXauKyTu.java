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
public class TN07_RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0, length = str.length();
        boolean run = true;
        while(i<length-1) {
            if(str.charAt(i) == str.charAt(i+1)) {
                str = str.substring(0, i) + str.substring(i+2, str.length());
                i=0;
                length = str.length();
            } else {
                i++;
            }    
        }
        
        if(str.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(str);
        }

    }
}
