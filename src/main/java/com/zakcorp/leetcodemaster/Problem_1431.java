package com.zakcorp.leetcodemaster;
import java.util.*;

public class Problem_1431 {
    static class Solver {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            // Using for each loop slows down the runtime of the program,
            // see my submission in LeetCode for this problem, https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
            /*List<Boolean> list = new ArrayList<>();
            int maxCandies = Integer.MIN_VALUE;
            for(int candy : candies) {
                maxCandies = Math.max(maxCandies, candy);
            }
            for(int candy : candies) {
                list.add(candy + extraCandies >= maxCandies);
            }
            return list;*/
            List<Boolean> list = new ArrayList<>();
            int n = candies.length;
            int maxCandies = 0;
            for(int i = 0; i < n; i++) {
                maxCandies = Math.max(maxCandies, candies[i]);
            }
            for(int i = 0; i < n; i++) {
                list.add(candies[i] + extraCandies >= maxCandies);
            }
            return list;
        }
    }
}
