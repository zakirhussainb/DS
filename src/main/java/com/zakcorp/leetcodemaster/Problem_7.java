package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_7 {
    static class Solver {
        public int solve1(int x) {
            int ans = 0;
            while(x != 0) {
                int tail = x % 10;
                int newAns = (ans * 10) + tail;
                if( (newAns - tail) / 10 != ans) {
                    return 0;
                }
                ans = newAns;
                x /= 10;
            }
            return ans;
        }
    }
}
