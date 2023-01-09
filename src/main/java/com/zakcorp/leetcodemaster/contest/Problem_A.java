package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int solve1(int[] arr) {
            int pos = 0;
            int neg = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < 0) {
                    neg++;
                } else if(arr[i] > 0) {
                    pos++;
                }
            }
            return Math.max(pos, neg);
        }
    }
}
