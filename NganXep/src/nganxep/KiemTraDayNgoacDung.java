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

public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0) {
            String s = in.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(String s) {
        Stack<Character> st = new Stack();
        for(int i=0; i<s.length(); i++) {
            char out = s.charAt(i);
            if(out == '(' || out == '[' || out == '{')
                st.push(out);
            else { 
                if(st.empty()) return false;
                char in = st.peek();
                if(in == '(' && out == ')') st.pop();
                else if(in == '[' && out == ']') st.pop();
                else if(in == '{' && out == '}') st.pop();
                else return false;
            }
        }
        
        return st.empty();
    }
}
