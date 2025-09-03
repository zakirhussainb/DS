package com.zakcorp.striver_series.dp.strings;

public class DP_Strings_5 {
    static Helper helper = new Helper();
    static class Tabulation {
        public int solve1(String str1, String str2) {
            int m = str1.length(), n = str2.length();
            int lcs = helper.findLengthOfLongestCommonSubsequence(str1, str2);
            return (m - lcs) + (n - lcs) ;
        }
    }
}
