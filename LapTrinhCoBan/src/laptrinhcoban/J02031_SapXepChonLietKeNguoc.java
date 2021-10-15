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
public class J02031_SapXepChonLietKeNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n+1];
        for(int i=1; i<=n; i++) a[i] = sc.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        
        for(int i=1; i<=n-1; i++) {
            int min_index = i;
            for(int j=i+1; j<=n; j++) {
                if(a[min_index] > a[j]) {
                    min_index = j;
                }
            }
            
            int tmp = a[min_index];
            a[min_index] = a[i];
            a[i] = tmp;
            
            String str = "Buoc " + i + ":";
            for(int k=1; k<=n; k++)
                str += " " + a[k];
            arrayList.add(str);
        }
        
        for(int i=arrayList.size()-1; i>=0; i--) {
            System.out.println(arrayList.get(i));
        }
        
    }
}
