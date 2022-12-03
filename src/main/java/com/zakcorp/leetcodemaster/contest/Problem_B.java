package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int solve(String str) {
            if(str.isEmpty())
                return 0;
            int sum = 0;
            for(int i = 0; i < str.length(); i++) {
                sum += str.charAt( i ) - 'a' + 1;
            }
            return sum;
        }
    }
}
