package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_693 {
    static class Solver {
        public boolean solve1(int n) {
            int leftShift = (n << 1);
            if( (n ^ leftShift) == (n | leftShift) ) {
                return true;
            }
            return false;
        }
    }
}
