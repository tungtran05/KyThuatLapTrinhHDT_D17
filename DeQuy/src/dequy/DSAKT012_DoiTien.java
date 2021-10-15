package dequy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class DSAKT012_DoiTien {
    static int count = 0;
    static long a[], s;
    static int n, index;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextLong();
        a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        
        System.out.println(doitien());
    }
    
    public static int doitien() {
        index = n-1;
        long tmp = 0;
        while(index>=0 && tmp<=s) {
            if(tmp+a[index] <= s) {
                tmp += a[index];
                count++;
            }
            index--;
            if(tmp==s) break;
        }
        
        if(tmp==s) return count;
        return -1;
    }
}
