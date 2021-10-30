/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tichmatranvachuyenvicuano;

import java.util.Scanner;


class Matrix {
    
    int n, m, a[][];

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }
    
    Matrix(int n, int m, int a[][]) {
        this.n = n;
        this.m = m;
        this.a = a;
    }

    void nextMatrix(Scanner sc) {
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                a[i][j] = sc.nextInt();
    }

    Matrix trans() {
        int[][] b = new int[m][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                b[j][i] = a[i][j];
        
        return new Matrix(n, m, b);
    }

    Matrix mul(Matrix b) {
        Matrix c = new Matrix(n, n);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                c.a[i][j] = 0;
                for(int k=0; k<m; k++) {
                    c.a[i][j] = c.a[i][j] + this.a[i][k] * b.a[k][j];
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
                tmp += a[i][j] + " ";
            }
            tmp += "\n";
        }
        
        return tmp;
    }
    
    
}
