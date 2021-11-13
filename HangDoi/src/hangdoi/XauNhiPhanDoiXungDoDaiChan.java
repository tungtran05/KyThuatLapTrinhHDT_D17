/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangdoi;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class XauNhiPhanDoiXungDoDaiChan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            Queue<String> q = new ArrayDeque<>();

            q.add("0");
            q.add("1");
            String tmp = "";
            while (tmp.length() * 2 <= n) {
                tmp = q.poll();
                
                if(tmp.length() * 2 <= n) {
                    System.out.print(tmp);
                    for(int i=tmp.length()-1; i>=0; i--) {
                        System.out.print(tmp.charAt(i));
                    }
                    System.out.print(" ");
                }

                q.add(tmp + "0");
                q.add(tmp + "1");

            }
            System.out.println();
        }
    }
}
