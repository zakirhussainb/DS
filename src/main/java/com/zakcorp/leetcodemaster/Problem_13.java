package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_13 {
    static Map<Character, Integer> map = new HashMap<>();
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    static class Solver {
        public int solve1(String str) {
            int n = str.length();
            int sum = 0;
            int i = 0;
            while(i < n) {
                char ch = str.charAt(i);
                char nextCh = ' ';
                if(i + 1 < n) {
                    nextCh = str.charAt(i + 1);
                }
                if(ch == 'I' && (nextCh == 'V' || nextCh == 'X') ) {
                    sum += map.get(nextCh) - map.get(ch);
                    i++;
                } else if(ch == 'X' && (nextCh == 'L' || nextCh == 'C')) {
                    sum += map.get(nextCh) - map.get(ch);
                    i++;
                } else if(ch == 'C' && (nextCh == 'D' || nextCh == 'M')) {
                    sum += map.get(nextCh) - map.get(ch);
                    i++;
                } else {
                    sum += map.get(ch);
                }
                i++;
            }
            return sum;
        }
    }
}
