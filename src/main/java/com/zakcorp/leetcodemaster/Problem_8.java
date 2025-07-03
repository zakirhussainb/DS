package com.zakcorp.leetcodemaster;

public class Problem_8 {
    static class Solver {
        public int solve1(String str) {
            StringBuilder sb = new StringBuilder();
            int n = str.length();
            boolean isNegative = false;
            for(int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                if( Character.isWhitespace(ch) || ch == '+' ) {
                    continue;
                }
                if( ch == '-' ) {
                    isNegative = true;
                }
                if(Character.isLetter(ch) || ch == '.') {
                    break;
                }
                if(i > 0 && ch == '-') {
                    break;
                }
                sb.append(ch);
            }
            int res = convertToInt(sb.toString());
            return isNegative ? -res : res;
        }
        private int convertToInt(String str) {
            int n = str.length();
            int num = 0;
            for(int i = 0; i < n; i++) {
                num = (num * 10) + str.charAt(i) - '0';
            }
            return num;
        }
    }

}
