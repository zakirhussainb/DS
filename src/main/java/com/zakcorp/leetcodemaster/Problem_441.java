package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem_441 {
    static class Solver {
        public int arrangeCoins(int n) {
            int num = n;
            for(int i = 1; i <=n; i++) {
                num = num - i;
            }
            return 0;
        }
    }
}
