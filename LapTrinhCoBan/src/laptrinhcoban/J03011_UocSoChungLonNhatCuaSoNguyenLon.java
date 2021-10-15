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
public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    private static long uscln(long a, long b) {
        if(b==0) {
            return a;
        } else {
            return uscln(b, a % b);
        }
    }
    
    private static long rutgon(long a, String b) { // this is key resolve function
        long result = 0;
        for(int i=0; i<b.length(); i++) {
            result = (result * 10 + b.charAt(i) - '0') % a; 
        }
        
        return result;
    }
    
    private static long usclnBig(long a, String b) {
        long numB = rutgon(a, b);
        
        return uscln(a, numB);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int t=0; t<T; t++) {
            long a = Long.parseLong(sc.nextLine());
            String b = sc.nextLine();
            
            System.out.println(usclnBig(a, b));
        }
        
    }
}
