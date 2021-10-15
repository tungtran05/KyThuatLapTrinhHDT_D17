package laptrinhcoban;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class J02032_SapXepNoiBotLietKeNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            ArrayList<String> arrayList = new ArrayList<>();

            //
            for (int i = 0; i < n - 1; i++) {
                boolean swap = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                        swap = true;
                    }
                }

                if (swap == false) {
                    break;
                }

                String str = "Buoc " + (i+1) + ":";
                for(int k=0; k<n; k++)
                    str += " " + a[k];
                arrayList.add(str);
            }

            for(int i=arrayList.size()-1; i>=0; i--)
                System.out.println(arrayList.get(i));
            }
    }
}
