package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem_Day_14 {
    static class Solver {
        public String stringShift(String s, int[][] shiftArr) {
            for (int[] row : shiftArr) {
                int direction = row[0];
                int amount = row[1];
                if (direction == 0) {
                    s = leftShift(s, amount);
                } else if (direction == 1) {
                    s = rightShift(s, amount);
                }
            }
            return s;
        }
        private String leftShift(String str, int amount) {
            while(amount --> 0) {
                String first = str.substring(0, 1);
                str = str.substring(1);
                str = str + first;
            }
            return str;
        }
        private String rightShift(String str, int amount) {
            int n = str.length();
            while(amount --> 0){
                String last = str.substring(n - 1, n);
                str = str.substring(0, n - 1);
                str = last + str;
            }
            return str;
        }
    }
}
