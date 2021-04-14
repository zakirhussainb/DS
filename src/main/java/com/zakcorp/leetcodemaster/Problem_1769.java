package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1769 {
    /*
    1. Create a list containing all the One's index information
    2. Then find the difference of current index minus the jth one's index.
    TC - O(n*k)
    */
    static class Solver {
        public int[] solve1(String boxes) {
            int n = boxes.length();
            int[] result = new int[n];
            // 001011 -> 0
            // create an array that contains the one-indexes
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                if(boxes.charAt(i) == '1') {
                    list.add(i);
                }
            }
            for(int i = 0; i < n; i++) {
                for (int oneIndex : list) {
                    int x = i - oneIndex;
                    x = x < 0 ? -x : x;
                    result[i] += x;
                }
            }
            return result;
        }
        /*
        We first "move" balls from Left to Right, and track how many operations it takes for each box.
        For that, we count how many balls we got so far in cnt, and accumulate it in ops.
        TC - O(N)
        */
        public int[] solve2(String boxes) {
            // ops - refers to operations
            int n = boxes.length();
            int[] result = new int[n];
            // From Left to Right
            for(int i = 0, ops = 0, cnt = 0; i < n; i++) {
                result[i] += ops;
                cnt += boxes.charAt(i) - '0';
                ops += cnt;
            }
            // From Right to Left
            for(int i = n - 1, ops = 0, cnt = 0; i >= 0; i--) {
                result[i] += ops;
                cnt += boxes.charAt(i) - '0';
                ops += cnt;
            }
            return result;
        }
    }
}
