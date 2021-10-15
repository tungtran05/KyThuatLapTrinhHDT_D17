/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcoban;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Xuan Toog
 */
public class TN06_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> map = new HashMap<>();
        while(n-->0) {
            String str = sc.nextLine();
            
            str = str.trim().replaceAll("[ ]+", " ").toLowerCase();
            String arr[] = str.split(" ");
            String result = "" + arr[arr.length-1];
            for(int i=0; i<arr.length-1; i++) {
                result += arr[i].charAt(0) + "";
            }
            
            if(!map.containsKey(result)) {
                map.put(result, 1);
            } else {
                int count = map.get(result) + 1;
                map.replace(result, count);
                result += count + "";
            }
            
            result += "@ptit.edu.vn";
            System.out.println(result);
        }
    }
}
