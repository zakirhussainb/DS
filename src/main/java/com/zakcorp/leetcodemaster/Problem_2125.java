package com.zakcorp.leetcodemaster;

import java.util.LinkedList;

public class Problem_2125 {
    // Good Solution, But can avoid creating a new data structure like linked list and process the sum without storing in it.
    static class Solver {
        public int solve1(String[] bank) {
            LinkedList<Integer> ll = new LinkedList<>();
            for(String s : bank) {
                int v = getOnesCount(s);
                if(v > 0)
                    ll.add(v);
            }
            int val = 0;
            for(int i = 1; i < ll.size(); i++) {
                val += ll.get(i) * ll.get(i - 1);
            }
            return val;
        }

        private int getOnesCount(String s) {
            int sum = 0;
            for(char ch : s.toCharArray()) {
                if(ch == '1') {
                    sum++;
                }
            }
            return sum;
        }
    }

    static class Solver1 {
        public int solve1(String[] bank) {
            int val = 0, prev = 0;
            for(String s : bank) {
                int v = getOnesCount(s);
                if(v > 0) {
                    val += v * prev;
                    prev = v;
                }
            }
            return val;
        }

        private int getOnesCount(String s) {
            int sum = 0;
            for(char ch : s.toCharArray()) {
                if(ch == '1') {
                    sum++;
                }
            }
            return sum;
        }
    }
}
