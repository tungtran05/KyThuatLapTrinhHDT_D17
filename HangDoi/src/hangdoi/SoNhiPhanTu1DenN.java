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
public class SoNhiPhanTu1DenN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            xuly(n);
        }
    }
    
    public static void xuly(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-->0) {
            String tmp = q.poll();
            System.out.print(tmp+" ");
            q.add(tmp + "0");
            q.add(tmp + "1");
        }
        System.out.println();
    }
}
