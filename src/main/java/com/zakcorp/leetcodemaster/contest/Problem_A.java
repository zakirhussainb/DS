package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_5;

import java.util.*;
import java.util.Map;

public class Problem_A {
    static class Solver {
        public int solve1(int n) {
            int div = n / 7 + 1;
            int res = 0;
            int days = 0;
            for(int i = 1; i <= div; i++) {
                for(int j = i; j < i + 7; j++) {
                    if(days == n) {
                        break;
                    }
                    res += j;
                    days++;
                }
            }
            return res;
        }
    }
}
