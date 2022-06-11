package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_179 {
    static class Solver {
        public String solve1(int[] arr) {
            int n = arr.length;
            if(n == 1)
                return "" + arr[0];
            // Convert integer array to string array, so that we can sort later on
            String[] strArr = new String[n];
            for(int i = 0; i < n; i++) {
                strArr[i] = String.valueOf(arr[i]);
            }
            // Comparator to decide which string should come first in the concatenation
            Arrays.sort(strArr, new SortStringBasedOnSumComparator());
            // An extreme edge case by LC, say you have only a bunch of 0 in your int array
            if(strArr[0].charAt(0) == '0')
                return "0";
            StringBuilder sb = new StringBuilder();
            for(String s : strArr) {
                sb.append(s);
            }
            return sb.toString();
        }
    }
    static class SortStringBasedOnSumComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            String sum1 = str1 + str2;
            String sum2 = str2 + str1;
            // reverse order here, i.e, the largest 'sum' must come first, then the second largest
            return sum2.compareTo(sum1);
        }
    }
}
