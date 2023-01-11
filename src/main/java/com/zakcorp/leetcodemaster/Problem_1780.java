package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1780
{
    static class Solver {
        public boolean solve1(int n) {
            if(n <= 1)
                return true;
            if(n % 3 == 2) {
                return false;
            }
            return solve1(n / 3);
        }
    }
}
