/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcoban;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class TN04_SoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            String str = sc.nextLine();
            int length = str.length();
            boolean check = true;

            for (int i = 0; i < str.length() / 2; i++) {
                if ((Integer.parseInt(str.charAt(i) + "") % 2 == 1)
                        && (str.charAt(i) == str.charAt(length - i - 1))) {
                    check = false;
                }
            }
            if (length % 2 == 1) {
                int index = str.length() / 2 + 1;
                if (Integer.parseInt(str.charAt(index) + "") % 2 == 1) {
                    check = false;
                }
            }

            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
