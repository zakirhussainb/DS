package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_62 {
    static class Solver {
        public int gridRecursive(int m, int n) {
            if(m == 1 || n == 1) {
                return 1;
            }
            return gridRecursive(m, n - 1) + gridRecursive(m - 1, n);
        }
    }
}
