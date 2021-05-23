package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1869 {
    static class Solver {
        public boolean solve1(String str) {
            int n = str.length();
            int start = 0, end = 0;
            int ones = 0,  zeros = 0;
            for(; end < n; end++) {
                char endCh = str.charAt(end);
                char stCh = str.charAt(start);
                if(endCh != stCh) {
                    if(stCh == '1') {
                        ones = Math.max(ones, end - start);
                    } else {
                        zeros = Math.max(zeros, end - start);
                    }
                    start = end;
                }
            }
            if(start < end) {
                if(str.charAt(start) == '1') {
                    ones = Math.max(ones, end - start);
                } else {
                    zeros = Math.max(zeros, end - start);
                }
            }
            return ones > zeros;
        }
    }
}
