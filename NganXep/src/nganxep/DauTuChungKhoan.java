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
public class DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int B[] = new int [n];
            int a[] = new int [n];
            Stack<Integer> st = new Stack<>();
            
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();
            
            for(int i=0; i<n; i++) {
                int count = 1;
                while(!st.empty() && st.peek()<=a[i]){
                    st.pop();
                    count++;
                }
                if(st.empty()) B[i] = 1;
                else B[i] = count;
                st.push(a[i]);
            }
            
            for(int i=0; i<n; i++)
                System.out.print(B[i]+" ");
            System.out.println();
        }
    }
}
