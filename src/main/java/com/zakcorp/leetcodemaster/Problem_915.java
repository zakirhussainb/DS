package com.zakcorp.leetcodemaster;

public class Problem_915
{
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int[] maxLeft = new int[n]; // largest element to the left
            int[] minRight = new int[n]; // smallest element to the right

            maxLeft[0] = arr[0];
            for(int i = 1; i < n; i++) {
                maxLeft[i] = Math.max( maxLeft[i - 1], arr[i] );
            }

            minRight[n - 1] = arr[n - 1];
            for(int i = n - 2; i >= 0; i--) {
                minRight[i] = Math.min( minRight[i + 1], arr[i] );
            }

            // We just need to iterate over maxLeft and minRight to find the 1st index
            // where maxLeft[i - 1] is less than or equal to minRight[i]
            for(int i = 1; i < n; i++) {
                if(maxLeft[i - 1] <= minRight[i]) {
                    return i;
                }
            }
            return -1;
        }
    }
}
