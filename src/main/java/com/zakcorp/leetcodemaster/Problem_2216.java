package com.zakcorp.leetcodemaster;

public class Problem_2216
{
    static class Solver {
        public int solve1(int[] arr) {
            int ans = 0;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] == arr[i + 1] && (i - ans) % 2 == 0)
                    ans++;
            }
            return ans + (arr.length - ans) % 2;
        }
    }
}
