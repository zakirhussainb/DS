package com.zakcorp.leetcodemaster;

public class Problem_2918 {
    static class Solver {
        public long solve1(int[] arr1, int[] arr2) {
            // Calculate the individual sums of both the arrays and also find out the number of zeros in both arrays.
            long sum1 = 0, sum2 = 0;
            long zeros1 = 0, zeros2 = 0;
            // Finding the sum and no. of zeros in array 1
            for(int num : arr1) {
                sum1 += num;
                if(num == 0) {
                    zeros1++;
                }
            }
            // Finding the sum and no. of zeros in array 2
            for(int num : arr2) {
                sum2 += num;
                if(num == 0) {
                    zeros2++;
                }
            }

            long minSum1 = sum1 + zeros1;
            long minSum2 = sum2 + zeros2;

            if(zeros1 == 0 && zeros2 == 0) {
                return minSum1 == minSum2 ? minSum1 : -1;
            } else if(zeros1 == 0) {
                return minSum1 >= minSum2 ? minSum1 : -1;
            } else if(zeros2 == 0) {
                return minSum2 >= minSum1 ? minSum2 : -1;
            }

            return Math.max(minSum1, minSum2);
        }
    }
}
