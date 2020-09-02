package com.zakcorp.grokking.coding.slidingwindow;

/**
 * Introduction Chapter
 */
public class Chapter_1 {
    /**
     * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
     * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
     * Output: [2.2, 2.8, 2.4, 3.6, 2.8]
     */
    public static void main(String[] args) {
        Solver p = new Solver();
        int K = 5;
        int[] arr = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
        for(double d : p.solve2(K, arr)) {
            System.out.print(d + ", ");
        }
    }
    static class Solver {
        // Brute Force Approach -> O(N * K)
        public double[] solve1(int K, int[] arr) {
            int n = arr.length;
            double[] result = new double[K];
            for(int i = 0; i <= n - K; i++) { // O(N)
                int sum = 0;
                for(int j = i; j < i + K; j++) { // O(K)
                    sum += arr[j];
                }
                result[i] = (double) sum / K;
            }
            return result;// Space O(K), Time O(N * K)
        }
        // Efficient Approach -> O(N) using Sliding Window
        public double[] solve2(int K, int[] arr) {
            double[] result = new double[K];
            int n = arr.length;
            int sum = 0;
            int start = 0;
            for(int end = 0; end < n; end++) { // O(N)
                sum = sum + arr[end];
                if(end >= K - 1) {
                    result[start] = (double) sum / K;
                    sum = sum - arr[start];
                    start++;
                }
            }
            return result;
        }
    }
}
