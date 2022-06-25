package com.zakcorp.leetcodemaster.contest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_A {
    static class Solver {
        // yo|uar|e**|b|e***au|tifu|l| -> 0,1,2,3,4,5,6
        // 0 and 6 - nc
        // 1, 3, 5 - nc
        // 2, 4 - c
        // yo|uar|e**|b|e***au|tifu|l**m|op|etht -> 0,1,2,3,4,5,6,7
        // 0 and 7 - nc
        // 1, 3, 5 - nc
        // 2, 4 - c
        public int solve1(String str) {
            int n = str.length();
            String[] split = str.split("\\|");
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < split.length; i++) {
                if(i % 2 == 0) {
                    sb.append(split[i]);
                }
            }
            return countAsterisk(sb.toString());
        }
        private int countAsterisk(String str) {
            int c = 0;
            for(char ch : str.toCharArray()) {
                if(ch == '*')
                    c++;
            }
            return c;
        }
    }
}
