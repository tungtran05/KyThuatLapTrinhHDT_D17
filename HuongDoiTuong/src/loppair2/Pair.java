/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loppair2;

class Pair<T0, T1> {
    private Integer T0;
    private Integer T1;

    public Pair(Integer T0, Integer T1) {
        this.T0 = T0;
        this.T1 = T1;
    }

    public boolean isPrime() {
        if(check(T0) && check(T1))
            return true;
        else 
            return false;
    }
    
    public boolean check(int n) {
        if(n<2) return false;
        for(int i=2; i*i<=n; i++)
            if(n%i==0) return false;
        return true;
    }

    @Override
    public String toString() {
        return T0 + " " + T1;
    }
    
    
}
