package com.zakcorp.leetcodemaster;

import java.util.Arrays;

/**
 * Created by Zakir Hussain B on 13/10/20.
 * Modified by Zakir Hussain B on 09/04/2023.
 *
 * @source: LeetCode
 * @topic: Duplicate Number
 * @sub-topic: Cyclic Sort, HashSet, Two Pointer, Binary Search
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/find-the-duplicate-number/
 * @pseudocode:
 */
public class Problem_287 {
    static class Solver {
        /**
         * Sorting Based solution
         * TC : O(N log N)
         * SC : O(1)
         */
        public int solve1(int[] arr) {
            Arrays.sort( arr);
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] == arr[i - 1]) {
                    return arr[i];
                }
            }
            return -1;
        }

        /**
         * Hashing based solution
         * TC : O(N)
         * SC : O(N)
         */
        public int solve2(int[] arr) {
            int n = arr.length;
            int[] hash = new int[n + 1];
            for(int num : arr) {
                hash[num]++;
            }
            for(int i = 0; i < n; i++) {
                if(hash[i] >= 2) {
                    return i;
                }
            }
            return -1;
        }

        /**
         * Hare and Tortoise Method
         * Algorithm
         *  1. Take two pointers, slow and fast.
         *  2. Move slow pointer 1 step ahead and fast pointer two steps ahead.
         *  3. Stop when they both reach the same position.
         *  4. Now place the fast pointer in the 1st position and the leave the slow pointer as it is.
         *  5. Now again traverse the slow and fast pointers, but this time only one step ahead.
         *  6. Stop when they both reach the same position.
         *  7. Return anyone of them. The resultant will be your duplicate number.
         *
         * TC : O(N)
         * SC : O(1)
         */
        public int solve3(int[] arr) {
            int slow = arr[0];
            int fast = arr[0];

            do {
                slow = arr[slow];
                fast = arr[arr[fast]];
            }while(slow != fast);

            fast = arr[0];
            while(slow != fast) {
                slow = arr[slow];
                fast = arr[fast];
            }

            return slow;
        }
    }
}
