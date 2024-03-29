package com.zakcorp.grokking.coding.fastslowpointers;

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
public class Chapter_4 {
    public boolean isHappy(int n) {
        int square = n;
        Set<Integer> set = new HashSet<>();
        while(square != 1) {
            int num = square;
            square = 0;
            while(num != 0) {
                int rem = num % 10;
                square = square + (rem * rem);
                num = num / 10;
            }
            if(!set.contains(square)) {
                set.add(square);
            } else {
                return false;
            }
        }
        return true;
    }
}