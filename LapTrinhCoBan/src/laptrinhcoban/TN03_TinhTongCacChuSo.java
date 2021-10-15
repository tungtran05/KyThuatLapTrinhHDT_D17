/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcoban;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class TN03_TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = Integer.parseInt(sc.nextLine());
        for(int t=0; t<T; t++) {
            String S = sc.nextLine();
            char[] arr = S.toCharArray();
            
            ArrayList<Character> arr1 = new ArrayList<>();
            long sum = 0;
            
            for(int i=0; i<arr.length; i++) {
                if(Character.isLetter(arr[i])) {
                    arr1.add(arr[i]);
                }
                if(Character.isDigit(arr[i])) {
                    sum += Long.parseLong(arr[i] + "");
                }
            }
            
            for(int i=0; i<arr1.size(); i++) {
                for(int j=i+1; j<arr1.size(); j++) {
                    if(arr1.get(i) > arr1.get(j)) {
                        char temp = arr1.get(i);
                        arr1.set(i, arr1.get(j));
                        arr1.set(j, temp);
                    }
                }
            }
            
            for(int i=0; i<arr1.size(); i++) {
                System.out.print(arr1.get(i));
            }
            System.out.print(sum + "\n");
        }
    }
}
