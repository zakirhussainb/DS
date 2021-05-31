package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_5;

import java.util.*;
import java.util.Map;

public class Problem_A {
    static class Solver {
        public boolean solve1(String firstWord, String secondWord, String targetWord) {
            return getSum(firstWord) + getSum(secondWord) == getSum(targetWord);
        }
        private int getSum(String str) {
            String val = "";
            for(int i = 0; i < str.length(); i++) {
                val += str.charAt(i) - 'a';
            }
            return Integer.parseInt(val);
        }
    }
}
