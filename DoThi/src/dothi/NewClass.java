/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi;

import java.util.Optional;

/**
 *
 * @author Xuan Toog
 */
public class NewClass {
    public static void main(String[] args) {
        String nameOfUser = "tRan      Xuan        tung";
        String a[] = nameOfUser.trim().toLowerCase().replaceAll("[ ]+", " ")
                .split(" ");
        String res = Character.toUpperCase(a[a.length-1].charAt(0)) + "" + a[a.length-1].substring(1);
        for(int i=0; i<a.length-1; i++) {
            res += Character.toUpperCase(a[i].charAt(0)) + "";
        }
        
        System.out.println(res);
        
        Optional<Employee> op = null;
        System.out.println(op.isEmpty());
    }
    
    class Employee {
        int a;
    }
}
