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
public class DSA06023_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=1; i<=n-1; i++) {
            for(int j=i+1; j<=n; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            
            System.out.print("Buoc " + i + ":");
            for(int k=1; k<=n; k++) {
                System.out.print(" " + arr[k]);
            }
            System.out.println();
        }
        
    }
}
