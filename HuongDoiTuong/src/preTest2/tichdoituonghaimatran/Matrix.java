/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preTest2.tichdoituonghaimatran;

import java.util.Scanner;

/**
 *
 * @author Xuan Toog
 */
public class Matrix {
    
    private int n, m;
    private int a[][];

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    void nextMatrix(Scanner sc) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    Matrix mul(Matrix b) {
        Matrix c = new Matrix(n, b.m);
        for(int i=0; i<n; i++) {
            for(int j=0; j<b.m; j++) {
                c.a[i][j] = 0;
                for(int k=0; k<m; k++) {
                    c.a[i][j] = c.a[i][j] + a[i][k] * b.a[k][j];
                }
            }
        }
        
        return c;
    }

    @Override
    public String toString() {
        String tmp = "";
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                tmp += a[i][j];
                if(j<m-1) tmp += " ";
            }
            if(i<n-1) tmp += "\n";
        }
        
        return tmp;
    }
    
    
    
}
