package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public boolean solve1(String number) {
            Map<Integer, Integer> initialMap = new HashMap<>();
            for(int i = 0; i < number.length(); i++) {
                initialMap.put(number.charAt(i) - '0', initialMap.getOrDefault(number.charAt(i) - '0', 0) + 1);
            }
            for(int i = 0; i < number.length(); i++) {
                if(!initialMap.containsKey(i)) {
                    initialMap.put(i, 0);
                }
            }
            int c = 0;
            for(int i = 0; i < number.length(); i++) {
                if (initialMap.containsKey(i)) {
                    if (initialMap.get(i) == number.charAt(i) - '0') {
                        c++;
                    }
                }
            }
            return c == number.length();
        }
    }
}
