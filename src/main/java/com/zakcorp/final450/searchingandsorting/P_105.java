package com.zakcorp.final450.searchingandsorting;

/* Reverse the array */
public class P_105 {
    static class Solver {
        public long[] solve1(int[] arr, int n)
        {
            long[] output = new long[n];
            for(int i = 0; i < n; i++) {
                long prod = 1;
                for(int j = 0; j < n; j++) {
                    if(i != j) {
                        prod *= arr[j];
                    }
                }
                output[i] = prod;
            }
            return output;
        }
        public long[] solve2(int[] arr, int n)
        {
//            long[] outputArr = new long[n];
//            long[] leftArr = new long[n];
//            int prod = 1;
//            for(int i = 0; i < n; i++) {
//                prod *= arr[i];
//                leftArr[i] = prod;
//            }
//            long[] rightArr = new long[n];
//            prod = 1;
//            for(int i = n - 1; i >= 0; i--) {
//                prod *= arr[i];
//                rightArr[i] = prod;
//            }
//            return outputArr;
        }

    }
}
