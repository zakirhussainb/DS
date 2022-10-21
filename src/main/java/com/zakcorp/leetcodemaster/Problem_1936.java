package com.zakcorp.leetcodemaster;

public class Problem_1936 {
    static class Solver {
        public int solve1(int[] rungs, int dist) {
            int ans = 0;
            if(dist < rungs[0]) {
                int diff = rungs[0] - dist;
                if( diff % dist == 0) {
                    ans += diff / dist;
                } else {
                    ans += (diff / dist) + 1;
                }
            }
            for(int i = 0; i < rungs.length - 1; i++) {
                if(rungs[i] + dist < rungs[i + 1]) {
                    int val = rungs[i + 1] - rungs[i];
                    if(val % dist == 0) {
                        ans += (val / dist) - 1;
                    } else {
                        ans += val / dist;
                    }
                }
            }
            return ans;
        }
    }
}
