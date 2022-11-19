package com.zakcorp.leetcodemaster;

public class Problem_2090
{
    static class Solver {
        public int[] solve1(int[] arr, int k) {
            int n = arr.length;
            int[] avgs = new int[n];
            // Fill the values for the before index
            for(int i = 0; i < k; i++) {
                if(i >= n)
                    break;
                avgs[i] = -1;
            }

            for(int i = k; i < n; i++) {
                int sum = 0;
                if(i + k <= n - 1) {
                    for(int j = i - k; j <= i + k; j++) {
                        sum += arr[j];
                    }
                    int denom = (2 * k) + 1;
                    avgs[i] = sum / denom;
                } else {
                    avgs[i] = -1;
                }
            }
            return avgs;
        }

        public int[] solve2(int[] arr, int k) {
            int n = arr.length;
            int[] avgs = new int[n];
            // Fill the values for the before index
            int i = 0;
            for(; i < k; i++) {
                if(i >= n)
                    break;
                avgs[i] = -1;
            }
            if(i == n)
                return avgs;
            long sum = 0;
            int firstIndex = 0;
            for(int j = 0; j <= k + k; j++) {
                if(j >= n) {
                    if(i == n - 1) {
                        avgs[i] = -1;
                        return avgs;
                    }
                }
                sum += arr[j];
            }
            int lastIndex = k + k;
            avgs[i++] = getAvg( sum, k );

            for(; i < n; i++) {
                if(i + k <= n - 1) {
                    sum -= arr[firstIndex];
                    sum += arr[lastIndex + 1];
                    avgs[i] = getAvg( sum, k );
                    firstIndex = i - k;
                    lastIndex = i + k;
                } else {
                    avgs[i] = -1;
                }
            }
            return avgs;
        }
        private int getAvg(long sum, int k) {
            long denom = ( 2L * k) + 1;
            return (int)(sum / denom);
        }
    }
}
