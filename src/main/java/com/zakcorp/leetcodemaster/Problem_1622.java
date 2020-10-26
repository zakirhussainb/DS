package com.zakcorp.leetcodemaster;

import java.util.ArrayList;

public class Problem_1622 {
    static class Fancy {
        ArrayList<Integer> seq;
        int mod;
        public Fancy() {
            seq = new ArrayList<>();
            mod = 1000_000_007;
        }
        public void append(int val) {
            seq.add(val);
        }
        public void addAll(int inc) {
            for(int i = 0; i < seq.size(); i++) {
                seq.set(i, seq.get(i) + inc);
            }
        }
        public void multAll(int m) {
            for(int i = 0; i < seq.size(); i++) {
                seq.set(i, ( (seq.get(i) % mod) * (m % mod) ) % mod );
            }
        }
        public int getIndex(int idx) {
            if(idx >= seq.size()) {
                return -1;
            }
            return seq.get(idx);
        }
        public void printList() {
            System.out.println(seq.toString());
        }
    }
}
