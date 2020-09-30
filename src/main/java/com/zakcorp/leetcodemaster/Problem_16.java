package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 30/09/20.
 *
 * @source: Grokking Coding, LeetCode
 * @topic: Two-Pointers
 * @sub-topic: Triplet Sum Close to Target
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/3sum-closest/
 * @pseudocode:
 */
public class Problem_16 {
    static class Solver {
        public int solve1(int[] arr, int target) {
            int n = arr.length;
            int aDist = Integer.MAX_VALUE, bDist = Integer.MAX_VALUE, x = Integer.MAX_VALUE, y = Integer.MAX_VALUE;
            for(int i = 0; i < n - 2; i++) {
                for(int j = i + 1; j < n - 1; j++) {
                    for(int k = j + 1; k < n; k++) {
                        int currentSum = arr[i] + arr[j] + arr[k];
                        if(currentSum == target)
                            return currentSum;
                        else if(currentSum < target) {
                            if(aDist > target - currentSum) {
                                aDist = target - currentSum;
                                x = currentSum;
                            }
                        } else {
                            if(bDist > currentSum - target) {
                                bDist = currentSum - target;
                                y = currentSum;
                            }
                        }
                    }
                }
            }
            if(aDist == bDist)
                return Math.min(x, y);
            else if(aDist < bDist)
                return x;
            else
                return y;
        }
        public int solve2(int[] arr, int target) {
            Arrays.sort(arr);
            int n = arr.length;
            int aDist = Integer.MAX_VALUE, bDist = Integer.MAX_VALUE, x = Integer.MAX_VALUE, y = Integer.MAX_VALUE;
            for(int i = 0; i < n - 2; i++) {
                int left = i + 1;
                int right = n - 1;
                while(left < right) {
                    int currSum = arr[i] + arr[left] + arr[right];
                    if(currSum == target) {
                        return currSum;
                    } else if(currSum < target) {
                        if(aDist > target - currSum) {
                            aDist = target - currSum;
                            x = currSum;
                        }
                        left++;
                    } else {
                        if(bDist > currSum - target) {
                            bDist = currSum - target;
                            y = currSum;
                        }
                        right--;
                    }
                }
            }
            if(aDist == bDist)
                return Math.min(x, y);
            else if(aDist < bDist)
                return x;
            else
                return y;
        }
    }
}