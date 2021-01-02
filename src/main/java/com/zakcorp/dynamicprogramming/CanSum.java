package com.zakcorp.dynamicprogramming;

/**
 * Created by Zakir Hussain B on 02/01/21.
 *
 * @source: Alvin's - https://youtu.be/oBt53YbR9Kk
 * @topic: Dynamic Programming
 * @sub-topic: Can Sum
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
/*
Write a function `canSum(targetSum, arr)` that takes in a targetSum and an array of numbers as arguments.

The function should return a boolean indicating whether or not it is possible to generate the targetSum using
the numbers from the array.

You may use an element of the array as many times as needed.

You many assume that all input numbers are non-negative.
 */
public class CanSum {
    static class Solver {
        public boolean recursive(int target, int[] arr) {
            if(target == 0)
                return true;
            if(target < 0)
                return false;
            for(int num : arr) {
                if( recursive(target - num, arr) ) {
                    return true;
                }
            }
            return false;
        }
    }

    static class Solver1 {
        public boolean memoized(int target, int[] arr) {
            return false;
        }
    }

    static class Solver2 {
        public boolean tabulation(int target, int[] arr) {
            return false;
        }
    }
}