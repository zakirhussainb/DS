package com.zakcorp.leetcodemaster;

public class Problem_2139 {
    static class Solver {
        public int solve1(int target, int maxDoubles) {
            int steps = 0;
            while(target > 0 && maxDoubles > 0) {
                if(target % 2 == 0) {
                    target = target / 2;
                    maxDoubles--;
                } else {
                    target--;
                }
                steps++;
            }
            return steps + target - 1;
        }
    }
}
