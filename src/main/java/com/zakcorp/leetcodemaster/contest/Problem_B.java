package com.zakcorp.leetcodemaster.contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_B {
    static class Solver {
        public int solve1(int[] tasks) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int task : tasks) {
                map.put(task, map.getOrDefault(task, 0) + 1);
            }
            int rounds = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int val = entry.getValue();
                if(val < 2)
                    return -1;
                while(val > 1) {
                    if(val % 3 == 0) {
                        val = val / 3;
                        rounds++;
                    } else if(val % 2 == 0) {
                        val = val / 2;
                        rounds++;
                    } else {
                        rounds += calc(val);
                        val = 1;
                    }
                }
                if(rounds == 0)
                    return -1;
            }
            return rounds;
        }
        private int calc(int val) {
            if(val < 2)
                return 0;
            if(val % 3 == 0 || val % 2 == 0)
                return 1;
            return calc(val % 3) + 1;
        }
    }
}
