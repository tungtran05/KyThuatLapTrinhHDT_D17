package dequy;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class T208_SoFibonacciThuN {

    public static int n, mod = (int) 1e9 + 7;

    public static class Matrix {

        long[][] a = new long[3][3];

        public Matrix() {
            a[0][0] = 0;
            a[0][1] = a[1][0] = a[1][1] = 1;
        }
    }

    public static Matrix mul(Matrix a, Matrix b) {
        Matrix res = new Matrix();
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                res.a[i][j] = 0;
                for (int k = 0; k <= 1; k++) {
                    res.a[i][j] = (res.a[i][j] + a.a[i][k] * b.a[k][j]) % mod;
                }
            }
        }
        return res;
    }

    public static Matrix power(Matrix a, long k) {
        if (k == 1) {
            return a;
        }
        Matrix x = power(a, k / 2);
        x = mul(x, x);
        if (k % 2 == 1) {
            x = mul(x, a);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            Matrix x = new Matrix();
            x = power(x, n);
            System.out.println(x.a[0][1]);
        }
    }
}
