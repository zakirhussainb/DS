package com.zakcorp.leetcodemaster;

public class Problem_775
{
    // Good Brute-Force Solution. But TLE for very large inputs.
    static class Solver {
        public boolean solve1(int[] arr) {
            int n = arr.length;
            int gi = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(arr[i] > arr[j]) {
                        gi++;
                    }
                }
            }
            int li = 0;
            for(int i = 0; i < n - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    li++;
                }
            }
            return gi == li;
        }
    }

    static class Solver1 {
        public boolean solve2(int[] arr) {
            return false;
        }
    }
}
