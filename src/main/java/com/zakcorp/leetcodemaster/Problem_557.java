package com.zakcorp.leetcodemaster;

import java.math.BigInteger;

public class Problem_557 {
    static class Solver {
        public String reverseWords(String str) {
            StringBuilder sb = new StringBuilder();
            String[] splitArr = str.split("\\s+");
            for (String s : splitArr) {
                sb.append(getReversedWord(s)).append(" ");
            }
            return sb.toString().trim();
        }
        private String getReversedWord(String str) {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }
    }
    static class Solver1 {
        public String reverseWords(String str) {
            if(str.isEmpty()) {
                return "";
            }
            int start = 0, end = -1;
            char[] chArr = str.toCharArray();
            int i = 0;
            for(char ch : chArr) {
                i++;
                if(ch != ' ') {
                    end++;
                } else {
                    swap(chArr, start, end);
                    start = i;
                    end = i - 1;
                }
            }
            swap(chArr, start, end);
            return new String(chArr);
        }
        private void swap(char[] chArr, int start, int end) {
            while(start < end) {
                char temp = chArr[end];
                chArr[end] = chArr[start];
                chArr[start] = temp;
                start++;
                end--;
            }
        }
    }
}
