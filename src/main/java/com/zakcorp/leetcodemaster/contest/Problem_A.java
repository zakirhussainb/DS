package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(int[] arr, int diff) {
            int n = arr.length;
            int c = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    for(int k = j + 1; k < n; k++) {
                        if(i < j && j < k) {
                            if(arr[j] - arr[i] == diff && arr[k] - arr[j] == diff)
                                c++;
                        }
                    }
                }
            }
            return c;
        }
    }
}
