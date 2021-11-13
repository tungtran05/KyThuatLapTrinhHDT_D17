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
public class SuaLaiDayNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String str = sc.nextLine();
            Stack<Character> st = new Stack();
            int count = 0;
            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                if(c == '(')
                    st.push(c);
                else {
                    if(st.empty()) {
                        st.push('(');
                        count++;
                    } else {
                        st.pop();
                    }
                }
            }
            
            // kq = count + (số dấu ngoặc mở trong stack / 2)
            System.out.println(count + st.size()/2);
        }
    }
}
