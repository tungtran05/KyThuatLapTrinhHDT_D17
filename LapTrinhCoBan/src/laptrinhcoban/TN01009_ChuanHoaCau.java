/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcoban;

import java.util.ArrayList;
import java.util.Scanner;

public class TN01009_ChuanHoaCau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()) {
            String str = sc.nextLine();
            arr.add(str);
        }
        
        for(String s : arr) {
            System.out.println(s);
        }
    }
}
