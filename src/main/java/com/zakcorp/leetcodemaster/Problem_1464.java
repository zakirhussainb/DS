package com.zakcorp.leetcodemaster;

public class Problem_1464 {
    static class Solver {
        public int maxProduct(int[] arr) {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MAX_VALUE;
            for (int num : arr) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }
            }
            return (max2 - 1) * (max1 - 1);
        }
    }

}
