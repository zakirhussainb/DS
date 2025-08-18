package com.zakcorp.striver_series.dp.lis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DP_Lis_3 {
    static class Tabulation {
        public List<Integer> solve1(int[] arr) {
            int n = arr.length;
            Arrays.sort(arr);
            int[] dp = new int[n];
            Arrays.fill(dp, 1);

            int[] indexArr = new int[n];
            int lastIndex = 0;
            int maxVal = 0;
            for(int currInd = 0; currInd < n; currInd++) {
                indexArr[currInd] = currInd;
                for(int prevInd = 0; prevInd < currInd; prevInd++) {
                    if( (arr[currInd] % arr[prevInd] == 0) &&
                            dp[currInd] < 1 + dp[prevInd]) {
                        dp[currInd] = 1 + dp[prevInd];
                        indexArr[currInd] = prevInd;
                    }
                }
                if(dp[currInd] > maxVal) {
                    lastIndex = currInd;
                    maxVal = dp[currInd];
                }
            }

            List<Integer> res = new ArrayList<>();

            while(indexArr[lastIndex] != lastIndex) {
                res.add(arr[lastIndex]);
                lastIndex = indexArr[lastIndex];
            }

            res.add(arr[lastIndex]);

            Collections.reverse(res);

            return res;
        }
    }
}
