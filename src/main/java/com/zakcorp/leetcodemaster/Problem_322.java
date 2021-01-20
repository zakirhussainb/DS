package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_322 {
    static class Solver {
        public int solve1(int[] coins, int amount) {
            return recursive(1, amount, coins);
        }
        private int recursive(int n, int amount, int[] coins) {
            if(amount < 0) {
                return 0;
            }
            if(amount == 0) {
                return 1;
            }
            if(n >= coins.length) {
                return 0;
            }
            return Math.min(recursive(n, amount - coins[n], coins),
                    recursive(n + 1, amount, coins) );
        }
    }
}
