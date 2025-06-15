package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_3152 {
    static class Solver {
        public boolean[] solve1(int[] arr, int[][] queries) {
            int n = arr.length;
            int[] prefix = new int[n];
            for(int i=1;i<n;i++){
                if(arr[i] % 2 == arr[i - 1] % 2) {
                    prefix[i] = prefix[i - 1] + 1;
                } else {
                    prefix[i] = prefix[i - 1];
                }
            }

            int m = queries.length;
            boolean[] ans = new boolean[m];
            for(int i=0;i<m;i++){
                int start = queries[i][0];
                int end = queries[i][1];

                ans[i] = prefix[end] - prefix[start] == 0;
            }
            return ans;
        }
    }
}
