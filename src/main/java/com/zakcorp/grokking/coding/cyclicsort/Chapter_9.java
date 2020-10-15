package com.zakcorp.grokking.coding.cyclicsort;

import java.util.*;

/**
 * Created by Zakir Hussain B on 15/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_9 {
    public int findNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        int maxN = Integer.MIN_VALUE;
        for (int num : arr) {
            maxN = Math.max(maxN, num);
        }
        for(int i = 1; i <= maxN; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}