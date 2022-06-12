package com.zakcorp.leetcodemaster.contest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_A {
    static class Solver {
        public double solve1(int[][] brackets, int income) {
            double res = 0.0;
            int prevAmnt = 0;
            for(int[] ele: brackets) {
                int amnt = ele[0];
                int tax = ele[1];
                int minSum = Math.min(amnt, income) - prevAmnt;
                res += Math.max((minSum) * tax / 100.0, 0);
                prevAmnt = amnt;
            }
            return res;
        }
    }
}
