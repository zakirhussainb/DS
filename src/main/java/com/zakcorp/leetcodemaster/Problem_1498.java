package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1498 {
    static class Solver {
        public int solve1(int[] arr, int target) {
            int n = arr.length;
            int mod = (int)1e9 + 7;
            Arrays.sort(arr);
            int[] pows = new int[n];
            pows[0] = 1;
            for(int i = 1; i < n; i++)
                pows[i] = (pows[i - 1] * 2) % mod;
            int left = 0, right =  n - 1;
            int res = 0;
            while(left <= right) {
                if(arr[left] + arr[right] > target) {
                    right--;
                } else {
                    res = (res + pows[right - left]) % mod;
                    left++;
                }
            }
            return res;
        }
    }
}
