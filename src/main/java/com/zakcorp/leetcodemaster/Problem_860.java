package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_860 {
    static class Solver {
        public boolean solve1(int[] bills) {
            if(bills[0] > 5) {
                return false;
            }
            int[] coins = new int[2];
            for (int bill : bills) {
                if (bill == 20) {
                    if (coins[0] > 0 && coins[1] > 0) {
                        coins[0]--;
                        coins[1]--;
                    } else if (coins[0] >= 3) {
                        coins[0] = coins[0] - 3;
                    } else {
                        return false;
                    }
                } else if (bill == 10) {
                    if (coins[0] == 0) {
                        return false;
                    }
                    coins[0]--;
                    coins[1]++;
                } else {
                    coins[0]++;
                }
            }
            return true;
        }
    }
}
