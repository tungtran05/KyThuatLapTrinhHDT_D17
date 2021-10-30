/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loppair;

public class Pair {
    private int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    public boolean isPrime() {
        return (check(first) && check(second));
    }
    
    private boolean check(int n) {
        if(n<2) return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
    
    
}
