/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author Xuan Toog
 */
public class DoanLiepTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int R[] = new int [n], a[] = new int [n];
            for(int j=0; j<n; j++)
                a[j] = sc.nextInt();
            
            
            Stack<Integer> st = new Stack();
            int i;
            
            int count = 0;
            for(i=0; i<n; i++) {
                
                while(!st.empty() && st.peek()<=a[i]){
                    st.pop();
                    count++;
                }
                if(st.empty() ) R[i] = 1;
                else R[i] = count+1;
                st.push(a[i]);
            }
            
            for(i=0; i<n; i++)
            System.out.print(R[i] + " ");
        }
        
        
    }
}
