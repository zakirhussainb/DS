package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1529
{
    static class Solver {
        public int solve1(String target) {
            int n = target.length();
            int flips = 0;
            char status = '0';
            for(int i = 0; i < n; i++) {
                if(status != target.charAt(i)) {
                    flips++;
                    status = status == '0' ? '1' : '0';
                }
            }
            return flips;
        }
    }
}
