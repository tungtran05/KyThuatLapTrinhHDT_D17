/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest3;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;
public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(String s) {
        Stack<Character> st = new Stack();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c=='[' || c=='(' || c=='{') st.push(c);
            else {
                if(st.empty()) return false;
                else if(c==']' && st.peek()=='[') st.pop();
                else if(c=='}' && st.peek()=='{') st.pop();
                else if(c==')' && st.peek()=='(') st.pop();
            }
        }
        
        return true;
    }
}
