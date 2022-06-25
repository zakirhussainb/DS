package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_C {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            Arrays.sort(arr);
            int x = n - 2;
            int i = n - 1;
            int maxXor = 0;
            int val = arr[i] & (arr[i] ^ arr[x]);
            arr[i] = val;
            for(int j = 0; j < arr.length; j++) {
                maxXor ^= arr[j];
            }
            return maxXor;
        }
    }
}
