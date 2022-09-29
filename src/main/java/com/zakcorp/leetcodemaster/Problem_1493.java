package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1493 {
    static class Solver {
        public int solve1(int[] arr) {
            int start = 0;
            int n = arr.length;
            int firstZeroPos = -1;
            int zeroCount = 0;
            int ans = 0;
            int end = 0;
            for(; end < n; end++) {
                if(arr[end] == 0) {
                    zeroCount++;
                    if(zeroCount == 1) {
                        firstZeroPos = end;
                    }
                }
                if(zeroCount > 1) {
                    ans = Math.max(ans, end - start - 1);
                    start = firstZeroPos + 1;
                    firstZeroPos = end;
                    zeroCount--;
                }
            }
            ans = Math.max(ans, end - start - 1);
            return ans;
        }
    }
}
