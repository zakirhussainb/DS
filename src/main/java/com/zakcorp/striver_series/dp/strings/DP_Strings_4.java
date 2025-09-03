package com.zakcorp.striver_series.dp.strings;

public class DP_Strings_4 {
    static Helper helper = new Helper();
    static class Tabulation {
        public int solve1(String str1) {
            StringBuilder sb = new StringBuilder(str1);
            String str2 = sb.reverse().toString();

            int n = str1.length();
            int lcs = helper.findLengthOfLongestCommonSubsequence(str1, str2);
            return n - lcs; // this will return the minimum insertions to make a string palindrome
        }
    }
}
