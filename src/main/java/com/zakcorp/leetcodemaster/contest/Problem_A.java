package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public String solve1(String str, int k) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.length(); i = i + k) {
                String part = "";
                if(i + k >= str.length()) {
                    part = str.substring(i, i + k - 1);
                } else {
                    part = str.substring(i, i + k);
                }
                int val = calculateVal(part);
                sb.append(val);
                str = sb.toString();
            }
            return sb.toString();
        }
        private int calculateVal(String part) {
            int sum = 0;
            for(char ch : part.toCharArray()) {
                sum += ch - '0';
            }
            return sum;
        }
    }
}
