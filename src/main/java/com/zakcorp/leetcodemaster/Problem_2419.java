package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_2419
{
    static class Solver {
        public int solve1(int[] arr) {
            int maxElement = Arrays.stream(arr).max().getAsInt();
            int maxLength = 0, currLength = 0;
            for(int num : arr) {
                if(num == maxElement) {
                    maxLength = Math.max( maxLength, ++currLength );
                } else {
                    currLength = 0;
                }
                maxElement = Math.max( maxElement, num );
            }
            return maxLength;
        }

        /*
        TODO : The below solution is wrong. You must not sort the array.
        [311155,311155,311155,311155,311155,311155,311155,311155,201191,311155]
        The output from the below program is 9.
        Whereas the subarray with maximum Length is just 8.
         */
        public int solve2(int[] arr) {
            Arrays.sort( arr );
            int n = arr.length;
            int maxLength = 1;
            int maxNum = arr[n - 1];
            int i = n - 1;
            while(i >= 0) {
                if(arr[i] < maxNum) {
                    break;
                }
                while(arr[i] == arr[i - 1]) {
                    i--;
                }
                maxLength = Math.max( maxLength, n - i );
                i--;
            }
            return maxLength;
        }
    }
}
