/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequy;

/**
 *
 * @author Xuan Toog
 */
import java.util.Scanner;

public class TN26_TapHop {
    static int c[]=new int[21],n,k,s,count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            n=sc.nextInt();
            k=sc.nextInt();
            s=sc.nextInt();
            if(n==0&&k==0&&s==0)
                break;
            quaylui(1);
            System.out.println(count);
            count=0;
        }
    }

    private static void quaylui(int i) {
        for(int j=c[i-1]+1;j<=n-k+i;j++){
            c[i]=j;
            if(i==k) xuly();
            else quaylui(i+1);
        }
    }

    private static void xuly() {
        int sum=0;
        for(int i=1;i<=k;i++){
            sum+=c[i];
        }
        if(sum==s) count++;
    }
}
