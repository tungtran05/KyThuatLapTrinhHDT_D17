/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;
public class DauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            Stack<Integer> st = new Stack();
            ArrayList<Integer> arr = new ArrayList();
            int count = 0;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '(') {
                    count++;
                    st.push(count);
                    arr.add(count);
//                    System.out.print(count);
                } else {
                    if(s.charAt(i) == ')') {
                        int tmp = st.peek();
//                        System.out.print(tmp);
                        arr.add(tmp);
                        st.pop();
                    }
                    else {
//                        System.out.print(" ");
                    }
                }
            }
            for(Integer x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
