/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopintset;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();

    public IntSet() {
    }
    
    public IntSet(int a[]) {
        for(int i=0; i<a.length; i++) {
            set.add(a[i]);
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        for(Integer i : set) {
            tmp = tmp + String.valueOf(i) + " ";
        }
        
        return tmp;
    }
    
    public IntSet union(IntSet other) {
        IntSet intSet = new IntSet();
        intSet.set.addAll(set);
        intSet.set.addAll(other.set);
        
        return intSet;
    }
}

