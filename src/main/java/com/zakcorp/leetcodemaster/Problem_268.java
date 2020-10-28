package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_268 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int sum = (n * (n + 1)) / 2;
            int sumArr = 0;
            for (int num : arr) {
                sumArr += num;
            }
            return sum - sumArr;
        }
        public int solve2(int[] arr) {
            int n = arr.length;
            int missingNum = n;
            for(int i = 0; i < n; i++) {
                missingNum = missingNum ^ (i ^ arr[i]);
            }
            return missingNum;
        }
    }
}
