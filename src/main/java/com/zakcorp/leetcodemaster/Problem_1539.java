package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 15/10/20.
 *
 * @source: LeetCode
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_1539 {
    static class Solver {
        public int solve1(int[] arr, int k) {
            Set<Integer> set = new HashSet<>();
            for(int num : arr) {
                set.add(num);
            }
            int i = 1;
            int counter = 0;
            for(; i <= 1000; i++) {
                if(!set.contains(i)) {
                    counter++;
                    if(counter == k) {
                        return i;
                    }
                }
            }
            return k - counter + 1000;
        }
        public int solve2(int[] arr, int k) {
            int[] hash = new int[1001];
            for(int num : arr) {
                hash[num]++;
            }
            int i = 1;
            int counter = 0;
            for(; i <= 1000; i++) {
                if(hash[i] == 0) {
                    counter++;
                    if(counter == k) {
                        return i;
                    }
                }
            }
            return k - counter + 1000;
        }
    }
}