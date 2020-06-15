package com.zakcorp.leetcodemaster;

public class Problem_168 {
    static class Solver {
        public String convertToTitle(int n) {
            if(n == 0) {
                return "";
            }
            return convertToTitle(--n / 26) + (char)('A' + (n % 26));
        }
    }
    static class Solver1 {
        public String convertToTitle(int n) {
            StringBuilder result = new StringBuilder();
            while(n > 0) {
                n--;
                result.append((char) ('A' + n % 26));
                n /= 26;
            }
            return result.reverse().toString();
        }
    }

}
