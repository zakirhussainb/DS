package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 18/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_1624 {
    static class Solver {
        public int solve1(String str) {
            int n = str.length();
            int res = -1;
            Map<Character, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < n; i++){
                if(map.containsKey(str.charAt(i))) {
                    res = Math.max(res, i - map.get(str.charAt(i)) - 1);
                } else {
                    map.put(str.charAt(i), i);
                }
            }
            return res;
        }
    }
}