package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_784 {
    static class Solver {
        public List<String> solve1(String str) {
            List<String> list = new ArrayList<>();
            recur(0, str, list, new StringBuilder());
            return list;
        }
        private void recur(int index, String str, List<String> list, StringBuilder sb) {
            if(index == str.length()) {
                list.add(sb.toString());
                return;
            }
            char ch = str.charAt(index);
            if(Character.isLetter(ch)) {
                sb.append(Character.toLowerCase(ch));
                recur(index + 1, str, list, sb);
                sb.deleteCharAt(sb.length() - 1);
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
            recur(index + 1, str, list, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
