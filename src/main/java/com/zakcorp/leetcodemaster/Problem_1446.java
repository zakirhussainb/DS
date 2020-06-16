package com.zakcorp.leetcodemaster;

public class Problem_1446 {
    static class Solver {
        // 1ms
        public int maxPower(String str) {
            int n = str.length();
            int i = 0; int j = 1;
            int count = 1, maxPow = 1;
            while(i < n && j < n) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                    maxPow = Math.max(maxPow, count);
                } else {
                    i = j;
                    count = 1;
                }
                j++;
            }
            return maxPow;
        }
    }
    static class Solver1 {
        // 0ms
        public String reverseOnlyLetters(String str) {
            int i = 0; int j = str.length() - 1;
            char[] chars = str.toCharArray();
            while(i <= j) {
                if( !Character.isLetter(chars[i]) ) {
                    i++;
                } else if( !Character.isLetter(chars[j]) ) {
                    j--;
                } else {
                    char temp = chars[j];
                    chars[j] = chars[i];
                    chars[i] = temp;
                    i++;
                    j--;
                }
            }
            return new String(chars);
        }
    }
}
