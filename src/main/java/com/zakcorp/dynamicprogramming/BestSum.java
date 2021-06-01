package com.zakcorp.dynamicprogramming;

import java.util.*;

/**
 * Created by Zakir Hussain B on 01/06/21.
 *
 * @source: Alvin's - https://youtu.be/oBt53YbR9Kk
 * @topic: Dynamic Programming
 * @sub-topic: Best Sum
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
/*
Write a function `bestSum(targetSum, arr)` that takes in a targetSum and an array of numbers as arguments.

The function should return an array containing the shortest combination of numbers that add up to exactly the targetSum.

If there is a tie for the shortest combination, you may return any one of the shortest.
 */
public class BestSum {
    static class Solver {
        public List<Integer> bestSum(int target, int[] arr) {
            if (target == 0)
                return new ArrayList<>();
            if (target < 0)
                return null;
            List<Integer> shortestComb = null;
            for (int num : arr) {
                int diff = target - num;
                List<Integer> currComb = bestSum(diff, arr);
                if (currComb != null) {
                    currComb.add(num);
                    if (shortestComb == null || currComb.size() < shortestComb.size()) {
                        shortestComb = currComb;
                    }
                }
            }
            return shortestComb;
        }
    }
}