/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author Xuan Toog
 */
public class So2UuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            Queue<String> q = new ArrayDeque<>();
            q.add("0"); q.add("1"); q.add("2");
            int count = 0;
            while(count < n) {
                String tmp = q.poll();
                
                if(check(tmp)) {
                    count++;
                    System.out.print(tmp + " ");
                }
                    
                
                q.add(tmp + "0");
                q.add(tmp + "1");
                q.add(tmp + "2");
                
            }
            System.out.println();
        }
    }
    
    public static boolean check(String s) {
        Integer tmp = Integer.parseInt(s);
        String str = String.valueOf(tmp);
        if(str.length() != s.length())
            return false;
        
        int count2 = 0, count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='2') count2++;
            else count++;
        }
        
        if(count2 > count)
            return true;
        return false;
    }
}
