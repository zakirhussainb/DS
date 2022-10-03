package com.zakcorp.leetcodemaster;

public class Problem_1545 {
    static class Solver {
        public char solve1(int n, int k) {
            String result = recursive(n, k);
            return result.charAt(k - 1);
        }
        private String recursive(int n, int k) {
            if(n == 1) {
                return "0";
            }
            String s = recursive(n - 1, k);
            String invert = getInvertOf(s);
            String reversed = getReverse(invert);
            return s + "1" + reversed;
        }
        private String getInvertOf(String s) {
            StringBuilder sb = new StringBuilder();
            for(char ch : s.toCharArray()) {
                if(ch == '0')
                    sb.append('1');
                else
                    sb.append('0');
            }
            return sb.toString();
        }
        private String getReverse(String s) {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        }
    }
}
