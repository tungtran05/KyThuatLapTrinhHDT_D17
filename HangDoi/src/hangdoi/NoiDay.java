/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangdoi;

import java.util.*;

/**
 *
 * @author Xuan Toog
 */
public class NoiDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = (int) (1e9+7);
        
        int t = sc.nextInt();
        PriorityQueue<Long> q;
        int n;
        long kq, a, b, c, sum;
        while(t-->0) {
            n = sc.nextInt();
            q = new PriorityQueue<>();
            for(int i=0; i<n ; i++)
                q.add(sc.nextLong());
            
            kq = 0;
            
            while(q.size() > 1) {
                a = q.poll();
                b = q.poll();
                sum = (a+b)%m;
                q.add(sum);
                kq = (kq+sum)%m;
            }
            
            System.out.println(kq);
        } 
    }
}
