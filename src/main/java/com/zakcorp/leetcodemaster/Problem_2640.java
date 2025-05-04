package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_2640 {
    static class Solver {
        public long[] solve1(int[] arr) {
            int n = arr.length;
            long[] convertArr = new long[n];
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                max = Math.max(max, arr[i]);
                convertArr[i] = arr[i] + max;
            }
//            System.out.println(Arrays.toString(convertArr));
            long[] solveArr = new long[n];
            solveArr[0] = convertArr[0];
            for(int i=1;i<n;i++){
                solveArr[i] = convertArr[i] + solveArr[i - 1];
            }
//            System.out.println("solveArr..." + Arrays.toString(solveArr));
            return solveArr;
        }

        public long[] solve2(int[] arr) {
            int n = arr.length;
            long[] solveArr = new long[n];
            int max = arr[0];
            solveArr[0] = arr[0] + max;

            for(int i = 1; i < n; i++) {
                max = Math.max(max, arr[i]);
                int conv = arr[i] + max;
                solveArr[i] = conv + solveArr[i - 1];
            }
//            System.out.println("solveArr..." + Arrays.toString(solveArr));
            return solveArr;
        }
    }
}
