package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1060 {
    static class Solver {
        public int solve1(int[] arr, int k) {
            int n = arr.length;
            int[] hash = new int[arr[n - 1] + 1];
            for(int num : arr) {
                hash[num]++;
            }
            int i;
            for(i = arr[0];  i < hash.length; i++) {
                if(hash[i] == 0) {
                    k--;
                }
                if(k == 0) {
                    return i;
                }
            }
            while(k --> 0) {
                ++i;
            }
            return i - 1;
        }
    }
}
