/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GameThu> arr = new ArrayList<>();
        while(n-->0) {
            GameThu gt = new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(gt);
        }
        
        Collections.sort(arr);
        
        for(GameThu gt : arr) {
            System.out.println(gt);
        }
    }
}
