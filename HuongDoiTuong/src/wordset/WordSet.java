/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordset;

import java.util.StringTokenizer;
import java.util.TreeSet;


class WordSet {
    private TreeSet<String> set = new TreeSet<>();

    public WordSet() {
    }

    public WordSet(String s) {
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        while(st.hasMoreTokens()) set.add(st.nextToken());
    }
    
    public WordSet union(WordSet other) {
        WordSet r = new WordSet();
        r.set.addAll(set);
        r.set.addAll(other.set);
        return r;
    }
    
    public WordSet intersection(WordSet other) {
        WordSet r = new WordSet();
        r.set.addAll(set);
        r.set.retainAll(other.set);
        return r;
    } 

    @Override
    public String toString() {
        String kq = "";
        for(String s : set) kq += s + " ";
        return kq.trim();
    }
    
    
}
