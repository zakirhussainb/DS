package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_784 {
    static class Solver {
        public List<String> letterCasePermutation(String str) {
            int n = str.length();
            Set<String> set = new HashSet<>();
            for(int i = 0; i < n; i++) {
                if(Character.isLetter(str.charAt(i))) {
                    char ch = Character.toUpperCase(str.charAt(i));
                    set.add(ch + str.substring(i, n - 1));
                }
            }
            return null;
        }
    }
}
