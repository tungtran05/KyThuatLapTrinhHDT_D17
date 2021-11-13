/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganxep;

import java.util.*;

/**
 *
 * @author Xuan Toog
 */
public class BieuThucTangGiam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String str = sc.nextLine();
            Stack<Integer> st = new Stack();
            String kq = "";
            for(int i=0; i<=str.length(); i++) {
                st.push(i+1);
                
                if(i==str.length() || str.charAt(i)=='I') {
                    while(!st.empty()) {
                        kq += String.valueOf(st.peek()); st.pop();
                    }
                    
                }
            }
            System.out.println(kq);
        }
    }
}
