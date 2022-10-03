package com.zakcorp.leetcodemaster;

public class Problem_1578 {
    static class Solver {
        /*
        Much smaller and easier to understand solution in Java:
        Just compare every character (i - 1) with previous character (i) in colors,
            if they are equal,
                find the lesser value at corresponding index in neededTime[], and add to the answer
         */
        public int solve1(String colors, int[] neededTime) {
            int cost = 0;
            for(int i = 1; i < colors.length(); i++) {
                if(colors.charAt(i - 1) == colors.charAt(i)) {
                    if(neededTime[i - 1] < neededTime[i]) {
                        cost += neededTime[i - 1];
                    } else {
                        cost += neededTime[i];
                        // move the ith - 1 index value to the ith index for comparison in next iteration
                        neededTime[i] = neededTime[i - 1];
                    }
                }
            }
            return cost;
        }
    }
}
