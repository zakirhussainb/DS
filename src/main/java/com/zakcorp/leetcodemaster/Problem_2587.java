package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2587 {
    static class Solver {
        public int solve1(int[] arr) {
            int n=arr.length;
            arr = Arrays.stream(arr)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();

            long[] prefix = new long[n];
            prefix[0] = arr[0];
            for(int i=1;i<n;i++){
                prefix[i] = arr[i] + prefix[i-1];
            }
            int posCnt = 0;
            for(int i=0;i<n;i++){
                if(prefix[i] > 0) {
                    posCnt++;
                }
            }
            return posCnt;
        }

        public int solve2(int[] arr) {
            int n=arr.length;
            arr = Arrays.stream(arr)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
//            System.out.println(Arrays.toString(arr));
            long prefixSum = 0;
            int posCnt = 0;
            for(int i=0;i<n;i++){
                prefixSum += arr[i];
                if(prefixSum > 0) {
                    posCnt++;
                }
            }

//            long[] prefix = new long[n];
//            prefix[0] = arr[0];
//            for(int i=1;i<n;i++){
//                prefix[i] = arr[i] + prefix[i-1];
//            }
//            int posCnt = 0;
//            for(int i=0;i<n;i++){
//                if(prefix[i] > 0) {
//                    posCnt++;
//                }
//            }
            return posCnt;
        }
    }
}
