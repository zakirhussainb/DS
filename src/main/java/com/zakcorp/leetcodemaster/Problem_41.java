package com.zakcorp.leetcodemaster;

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
public class Problem_41 {
    static class Solver {
        public int solve1(int[] arr) {
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
            return maxN < 0 ? 1 : maxN + 1;
        }
        // Using a separate hash[] table array wont work due to the size constraints
        /*public int solve2(int[] arr) {
            if( arr.length == 0 || (arr.length == 1 && arr[0] == 2147483647) ) {
                return 1;
            }
            int maxN = Integer.MIN_VALUE;
            for (int num : arr) {
                maxN = Math.max(maxN, num);
            }
            if(maxN < 0) {
                maxN = 1;
            }
            int sizeOfHash = (maxN == 2147483647) ? 2147483647 : maxN + 1;
            int[] hash = new int[sizeOfHash];
            for(int num : arr) {
                if(num >= 0) {
                    hash[num]++;
                }
            }
            for(int i = 1; i <= maxN; i++) {
                if(hash[i] == 0) {
                    return i;
                }
            }
            return maxN + 1;
        }*/
        public int solve2(int[] arr) {
            return 0;
        }
    }
}