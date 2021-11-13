/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class SoBDN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            
            Queue<Long> q = new LinkedList();
            
            q.add((long) 1);
            boolean c = true;
            while(c) {
                Long tmp = q.poll();
                if(tmp % n == 0) {
                    System.out.println(tmp);
                    c = false;
                }
                
                q.add(tmp*10);
                q.add(tmp*10 + 1);
            }
        }
    }
}
