package com.zakcorp.leetcodemaster;

public class Problem_917 {
    static class Solver {
        // 1ms
        public String reverseOnlyLetters(String str) {
            int i = 0; int j = str.length() - 1;
            StringBuilder sb = new StringBuilder(str);
            while(i <= j) {
                if( Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j)) ) {
                    sb.setCharAt(i, str.charAt(j));
                    sb.setCharAt(j, str.charAt(i));
                    i++;
                    j--;
                } else if( Character.isLetter(str.charAt(i)) && !Character.isLetter(str.charAt(j)) ) {
                    j--;
                } else if( !Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(j)) ) {
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
            return sb.toString();
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
