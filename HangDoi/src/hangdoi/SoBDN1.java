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
public class SoBDN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long n = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            int count = 0;
            
            boolean c = true;
            q.add((long) 1);
            while(c) {
                long tmp = q.poll();
                if(tmp <= n) 
                    count++;
                else
                    c = false;
                
                q.add(tmp*10);
                q.add(tmp*10+1);
            }
            
            System.out.println(count);
        }
    }
}
