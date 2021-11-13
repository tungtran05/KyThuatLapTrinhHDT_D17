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

public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt(), a[] = new int[n];
            for(int i=0; i<n; i++)
                a[i] = in.nextInt();
            xuly(a, n);
        }
    }
    
    public static void xuly(int[] a, int n) {
        int R[] = new int[n], i;
        Stack<Integer> st = new Stack();
        for(i=n-1; i>=0; i--) {
            while(!st.empty() && st.peek()<=a[i]) st.pop();
            if(st.empty()) R[i] = -1;
            else R[i] = st.peek();
            st.push(a[i]);
        }
        
        for(i=0; i<n; i++) {
            System.out.print(R[i] + " ");
        }
        System.out.println();
    }
}
