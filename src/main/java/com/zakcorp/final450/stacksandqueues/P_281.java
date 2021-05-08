package com.zakcorp.final450.stacksandqueues;

public class P_281 {
    static class Solver {
        public long[] solve1(long[] arr, int n)
        {
            long[] result = new long[n];
            result[n - 1] = -1;
            long max = arr[n - 1];
            for(int i = n - 2; i >= 0; i--) {
                if(arr[i] < max) {
                    if(arr[i] < arr[i + 1]) {
                        max = arr[i + 1];
                    }
                    result[i] = max;
                } else {
                    result[i] = -1;
                    max = arr[i];
                }
            }
            return result;
        }
    }
}
