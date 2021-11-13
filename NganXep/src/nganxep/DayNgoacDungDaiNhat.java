/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganxep;

/**
 *
 * @author Xuan Toog
 */

import java.util.*;

public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0) {
            String s = in.nextLine();
            System.out.println(tinh(s));
        }
    }
    
    public static int tinh(String s) {
        Stack<Integer> st = new Stack();
        st.push(-1);
        int kq = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') st.push(i);
            else {
                st.pop();
                if(!st.empty()) {
                    kq = Math.max(kq, i-st.peek());
                } else {
                    st.push(i);
                }
            }
        }
        
        return kq;
    }
}
