package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 05/10/20.
 *
 * @source: Grokking Coding/ LeetCode
 * @topic: Fast-Slow Pointers
 * @sub-topic: Happy Number
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/happy-number/
 * @pseudocode:
 */
public class Problem_202 {
    static class Solver {
        public boolean solve1(int n) {
            if(n == 1 || n == 7) {
                return true;
            } else if(n < 10) {
                return false;
            }
            int sum = calculateSquare(n);
            return solve1(sum);
        }
        public boolean solve2(int n) {
            int slow = n;
            int fast = n;
            do {
                slow = calculateSquare(slow);
                // if fast pointer is at "1" it will stay at "1" only, without moving forward
                fast = calculateSquare(calculateSquare(fast));
            }while (slow != fast);
            return slow == 1;
        }
        public boolean solve3(int n) {
            int square = n;
            Set<Integer> set = new HashSet<>();
            while(square != 1) {
                square = calculateSquare(square);
                if(!set.contains(square)) {
                    set.add(square);
                } else {
                    return false;
                }
            }
            return true;
        }
        public int calculateSquare(int n) {
            int squareSum = 0;
            while(n > 0) {
                int temp = n % 10;
                squareSum = squareSum + (temp * temp);
                n = n / 10;
            }
            return squareSum;
        }
    }
}
