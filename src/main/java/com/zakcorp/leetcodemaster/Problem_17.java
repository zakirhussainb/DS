package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_17 {
    static class Solver {
        List<String> output;
        static Map<String, String> map;
        public Solver() {
            output = new ArrayList<>();
            map = new HashMap<>();
            buildMap();
        }
        private void buildMap() {
            map.put("2", "abc");
            map.put("3", "def");
            map.put("4", "ghi");
            map.put("5", "jkl");
            map.put("6", "mno");
            map.put("7", "pqrs");
            map.put("8", "tuv");
            map.put("9", "wxyz");
        }

        public List<String> solve1(String digits) {
            if(digits.length() == 0) {
                return output;
            }
            recursive("", digits);
            return output;
        }
        private void recursive(String combination, String digits) {
            if(digits.length() == 0) {
                output.add(combination);
            } else {
                String number = digits.substring(0, 1);
                String letters = map.get(number);
                for(int i = 0; i < letters.length(); i++) {
                    String alphabet = letters.substring(i, i + 1);
                    recursive(combination + alphabet, digits.substring(1) );
                }
            }
        }
    }
}
