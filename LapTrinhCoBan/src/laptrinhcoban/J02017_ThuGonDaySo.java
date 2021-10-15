/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcoban;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class J02017_ThuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int i = 0;
        int length = a.size();
        while (i < length - 1) {
            if((a.get(i) + a.get(i+1)) % 2 == 0) {
                a.remove(i);
                a.remove(i);
                length = a.size();
                i=0;
            } else { 
                i++;
            }
            
        }

        System.out.println(a.size());
    }
}
