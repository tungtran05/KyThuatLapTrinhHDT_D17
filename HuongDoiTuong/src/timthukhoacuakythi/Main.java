/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timthukhoacuakythi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> diems = new ArrayList<>();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++) {
            ThiSinh ts = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), 
                    Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arr.add(ts);
            diems.add(ts.getTongdiem());
        }
        
        float max = diems.get(0);
        for(float f : diems) {
            if(f>max) max = f;
        }
        
        for(ThiSinh ts : arr) {
            if(ts.getTongdiem() == max)
                System.out.println(ts);
        }
    }
}
