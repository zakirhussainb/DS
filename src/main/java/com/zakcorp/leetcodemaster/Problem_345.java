package com.zakcorp.leetcodemaster;

public class Problem_345 {
    static class Solver {
        public String reverseVowels(String str) {
            if(str.isEmpty()) {
                return "";
            }
            int l = 0; int r = str.length() - 1;
            char[] chars = str.toCharArray();
            while(l <= r) {
                if( !isVowel(chars[l]) && !isVowel(chars[r]) ) {
                    l++; r--;
                } else if( !isVowel(chars[l]) && isVowel(chars[r]) ) {
                    l++;
                } else if( isVowel(chars[l]) && !isVowel(chars[r]) ) {
                    r--;
                } else {
                    char temp = chars[r];
                    chars[r] = chars[l];
                    chars[l] = temp;
                    l++; r--;
                }
            }
            return new String(chars);
        }
        private boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        }
    }
}
