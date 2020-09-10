package com.zakcorp.leetcodemaster;
import java.util.*;
/**
 * Created by Zakir Hussain B on 10/09/20.
 *
 * @source: Grokking Coding, LeetCode
 * @topic: Sliding Window, Two Pointers
 * @sub-topic: Longest Substring with 2 distinct characters
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/fruit-into-baskets/
 * @pseudocode:
 */
public class Problem_904 {
    public int totalFruit(int[] tree) {
        int start = 0;int end;
        Map<Integer, Integer> map = new HashMap<>();
        for(end = 0; end < tree.length; end++) {
            map.put(tree[end], map.getOrDefault(tree[end], 0) + 1);
            if(map.size() > 2) {
                map.put(tree[start], map.get(tree[start]) - 1);
                map.remove(tree[start++], 0);
            }
        }
        return end - start;
    }
}