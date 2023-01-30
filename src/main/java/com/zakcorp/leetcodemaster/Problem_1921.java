package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1921
{
    static class Solver {
        public int solve1(int[] dist, int[] speed) {
            int ans = 0;
            int wc = 1;
            for(int i = 0; i < dist.length; i++) {
                int time = dist[i] / speed[i];
                if(wc <= time) {
                    ans++;
                } else {
                    return ans;
                }
                wc++;
            }
            return ans;
        }
    }
}
