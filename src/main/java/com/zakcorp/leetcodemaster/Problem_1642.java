package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1642 {
    static class Solver {
        public int solve1(int[] heights, int bricks, int ladders) {
            int n = heights.length;
            int start = heights[0];
            int ans = 0;
            for(int i = 1; i < n; i++) {
                if(start >= heights[i]) {
                    ans++;
                } else {
                    if(bricks >= heights[i] - start) {
                        bricks -= heights[i] - start;
                        ans++;
                    } else if(ladders > 0) {
                        ladders--;
                        ans++;
                    } else {
                        break;
                    }
                }
                start = heights[i];
            }
            return ans;
        }
    }
}
