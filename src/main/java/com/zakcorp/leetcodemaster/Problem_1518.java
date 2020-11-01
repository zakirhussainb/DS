package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1518 {
    static class Solver {
        public int solve1(int numBottles, int numExchange) {
            int drink = numBottles;
            // Exchange loop
            while (numBottles >= numExchange) {
                if(numBottles % numExchange == 0) {
                    numBottles = numBottles / numExchange;
                    drink += numBottles;
                } else {
                    drink += (numBottles / numExchange);
                    numBottles = (numBottles % numExchange) + (numBottles / numExchange);
                }
            }
            return drink;
        }
    }
}
