/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopintset_fake;

import java.util.TreeSet;

/**
 *
 * @author Xuan Toog
 */
public class IntSet {
    private TreeSet set = new TreeSet<Integer>();
    
    public IntSet() {
        
    }

    public IntSet(int[] a) {
        for(int i : a)
            set.add(i);
    }

    public IntSet union(IntSet s2) { // hop
        IntSet kq = new IntSet();
        kq.set.addAll(set);
        kq.set.addAll(s2.set);
        
        return kq;
    }
    
    public IntSet intersection(IntSet s2) { // giao
        IntSet kq = new IntSet();
        kq.set.addAll(set);
        kq.set.retainAll(s2.set);
        
        return kq;
    }
    
    public IntSet subtract(IntSet s2) { // setA - setB
        IntSet giao = this.intersection(s2);
        IntSet kq = new IntSet();
        kq.set.addAll(set);
        for(Object i : giao.set) {
            kq.set.remove(i);
        }
        
        return kq;
    }

    @Override
    public String toString() {
        String tmp = "";
        for(Object i : set) {
            tmp += i + " ";
        }
        
        return tmp.trim();
    }
    
    
}
