package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 11/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_448 {
    static class Solver {
        public List<Integer> findDisappearedNumbers(int[] arr) {
            int n = arr.length;
            List<Integer> result = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }
            for(int i = 1; i <= n; i++) {
                if(!set.contains(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}