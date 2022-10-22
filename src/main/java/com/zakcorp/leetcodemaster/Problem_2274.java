package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_2274 {
    static class Solver {
        public int solve1(int bottom, int top, int[] special) {
            // Sort special floors.
            Arrays.sort(special);
            int n = special.length;
            // The bottom consecutive floors count is special[0] - bottom
            // The top consecutive floors count is top - special[n - 1]
            int maxNum = Math.max( (special[0] - bottom), (top - special[n - 1]) );
            for(int i = 1; i < n; i++) {
                // The maximum consecutive floors between special is special[i] - special[i - 1] - 1
                maxNum = Math.max(maxNum, special[i] - special[i - 1] - 1);
            }
            return maxNum;
        }
    }
}
