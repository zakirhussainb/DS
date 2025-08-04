package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public String solve1(String str) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(Character.isLetter(ch)) {
                    sb.append(ch);
                } else if(ch == '*') {
                    if(sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                } else if(ch == '#') {
                    if(sb.length() > 0) {
                        String temp = sb.toString();
                        sb.append(temp);
                    }
                } else if(ch == '%') {
                    if(sb.length() > 0) {
                        sb.reverse();
                    }
                }
            }
            return sb.toString();
        }
    }
}
