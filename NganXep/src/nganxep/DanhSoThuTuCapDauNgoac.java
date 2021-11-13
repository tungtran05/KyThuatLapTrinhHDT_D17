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
public class DanhSoThuTuCapDauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            ArrayList<Integer> arr = new ArrayList();
            int index = 1;
            
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '(') {
                    st.push(index);
                    arr.add(index);
                    index++;
                }
                if(s.charAt(i) == ')') {
                    int tmp = st.pop();
                    arr.add(tmp);
                }
            }
            
            for(int i=0; i<arr.size(); i++)
                System.out.print(arr.get(i) + " ");
            System.out.println();
        }
    }
}
