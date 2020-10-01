package com.zakcorp.grokking.coding.twopointers;

import java.util.*;

/**
 * Created by Zakir Hussain B on 01/10/20.
 *
 * @source: Grokking Coding
 * @topic: Two-Pointers
 * @sub-topic: Triplets with Smaller Sum
 * @platform: Grokking Coding
 * @problem_link: It is there is LeetCode but premium.
 * @pseudocode:
 */
public class Chapter_7 {
    static class Solver {
        public int solve1(int[] arr, int target) {
            int n = arr.length;
            Arrays.sort(arr);
            int tripletCounter = 0;
            for(int i = 0; i < n - 2; i++) {
                int left = i + 1, right = n - 1;
                while(left < right) {
                    if(arr[left] + arr[right] + arr[i] < target) {
                        // Important:- Since arr[right] >= arr[left], therefore we can include/count all the numbers
                        // between this range of numbers.
                        tripletCounter += right - left;
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return tripletCounter;
        }
    }

}