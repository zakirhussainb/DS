package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_3096 {
    static class Solver {
        public int solve1(int[] possible) {
            int[] counter = new int[2];
            for(int i = 0; i < possible.length; i++) {
                counter[possible[i]]++;
            }
//            System.out.println(Arrays.toString(counter));
            if(counter[1] == 0) {
                if (counter[0] == 1) {
                    return 1;
                }
                return -1;
            }
            if(counter[0] == 1 && counter[1] == 1) {
                return -1;
            }
            int ans = 0;
            if(counter[0] == 0 && counter[1] > 0) {
                ans += (counter[1] / 2) + 1;
            }

            return ans == 0 ? 1 : ans;
        }
    }
}
