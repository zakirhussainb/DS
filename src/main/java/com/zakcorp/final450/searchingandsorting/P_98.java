package com.zakcorp.final450.searchingandsorting;

public class P_98 {
    // Searching in an array where adjacent differ by at most k
    static class Solver {
        public int solve1(int[] arr, int n, int x, int k)
        {
            int i = 0;
            while(i < n) {
                if(arr[i] == x) {
                    return i;
                }
                int diff = Math.abs(arr[i] - x);
                i = i + Math.max(1, diff / k);
            }
            return -1;
        }
    }
}
