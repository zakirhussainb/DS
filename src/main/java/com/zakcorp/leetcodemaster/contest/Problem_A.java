package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_5;

import java.util.*;
import java.util.Map;

public class Problem_A {
    static class Solver {
        public int solve1(int[] arr) {
            int sum = 0;
            int max = sum;
            for (int num : arr) {
                sum += num;
                max = Math.max(max, sum);
            }
            return max;
        }
    }
}
