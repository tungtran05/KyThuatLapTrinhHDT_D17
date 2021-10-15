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
public class TN05_ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while(T-->0) {
            String str = sc.nextLine();
            str = str.trim().toLowerCase().replaceAll("[ ]+", " ");
            String[] arr = str.split(" ");
            for(int i=0; i<arr.length; i++) {
                char tmp = arr[i].toUpperCase().charAt(0);
                arr[i] = tmp + arr[i].substring(1, arr[i].length());
            }
            
            String result = "";
            for(int i=0; i<arr.length; i++) {
                result += arr[i] + " ";
            }
            System.out.println(result);
        }
    }
}
