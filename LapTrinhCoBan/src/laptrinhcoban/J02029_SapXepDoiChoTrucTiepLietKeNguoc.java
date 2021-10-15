package laptrinhcoban;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class J02029_SapXepDoiChoTrucTiepLietKeNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int a[] = new int [n+1];
            for(int i=1; i<=n; i++) a[i] = sc.nextInt();
            ArrayList<String> arrayList = new ArrayList<>();
            
            for(int i=1; i<=n-1; i++) {
                for(int j=i+1; j<=n; j++) {
                    if(a[i] > a[j]) {
                        int tmp = a[j]; a[j] = a[i]; a[i] = tmp;
                    }
                }
                
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
}
