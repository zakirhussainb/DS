package com.zakcorp.leetcodemaster.contest.biweekly.fortyone;

import java.util.*;

public class A {
    static class Solver {
        public int solve1(String allowed, String[] words) {
            Set<Character> set = new HashSet<>();
            for(char ch : allowed.toCharArray()) {
                set.add(ch);
            }
            int count = 0;
            for (String word : words) {
                boolean flag = true;
                for (char ch : word.toCharArray()) {
                    if (!set.contains(ch)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
            return count;
        }
    }
}
