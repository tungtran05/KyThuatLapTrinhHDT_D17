/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganxep;

import java.util.*;

/**
 *
 * @author Xuan Toog
 */
public class SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            Queue<String> q = new ArrayDeque<>();
            ArrayList<String> arr = new ArrayList<>();
            
            q.add("6"); q.add("8");
            String tmp = "";
            while(tmp.length() <= n) {
                tmp = q.poll();
                if(tmp.length() <=n)
                    arr.add(tmp);
                
                q.add(tmp+"6");
                q.add(tmp+"8");
            }
            
            System.out.println(arr.size());
            for(int i=arr.size()-1; i>=0; i--)
                System.out.print(arr.get(i) + " ");
            System.out.println();
        }
    }
}
