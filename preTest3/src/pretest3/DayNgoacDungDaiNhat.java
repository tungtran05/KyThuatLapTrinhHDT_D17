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
public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            System.out.println(tinh(s));
        }
    }
    
    public static int tinh(String s) {
        Stack<Integer> st = new Stack();
        int kq = 0;
        st.push(-1);
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(') st.push(i);
            else {
                st.pop();
                if(!st.empty())
                    kq = Math.max(kq, i-st.peek());
                else
                    st.push(i);
            }
        }
        
        return kq;
    }
}
