package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1823 {
    static class Solver {
        public int solve1(int n, int k) {
            LinkedList<Integer> ll = new LinkedList<>();
            for(int i = 1; i <= n; i++) {
                ll.add(i);
            }
            int index = 0;
            while(ll.size() > 1) {
                index = (index + k - 1) % ll.size();
                ll.remove(index);
            }
            return ll.getFirst();
        }
    }
}
