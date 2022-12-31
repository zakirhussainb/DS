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
    }
}
