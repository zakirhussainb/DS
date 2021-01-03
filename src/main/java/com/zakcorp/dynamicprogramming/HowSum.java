package com.zakcorp.dynamicprogramming;

import java.util.*;

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
Write a function `howSum(targetSum, arr)` that takes in a targetSum and an array of numbers as arguments.

The function should return an array containing any combination of elements that add up to exactly the targetSum. If there
is no combination that add up to the targetSum, then return null.

If there are  multiple combinations possible, you may return any single one.
 */
public class HowSum {
    static class Solver {
        public int[] recursive(int target, int[] arr) {
            LinkedList<Integer> ll = howSum(target, arr);
            int[] res = null;
            if( !ll.isEmpty() ) {
                res = new int[ll.size()];
            }
            for(int i = 0; i < ll.size(); i++) {
                res[i] = ll.get(i);
            }
            return res;
        }
        private LinkedList<Integer> howSum(int target, int[] arr) {
            if(target == 0)
                return new LinkedList<>();
            if(target < 0)
                return null;
            for(int num : arr) {
                LinkedList<Integer> res = howSum(target - num, arr);
                if( res != null ) {
                    res.add(num);
                    return res;
                }
            }
            return null;
        }
    }

    static class Solver1 {
        public int[] memoized(int target, int[] arr) {
            LinkedList<Integer> ll = howSum(target, arr, new LinkedList<>());
            int[] res = null;
            if( !ll.isEmpty() ) {
                res = new int[ll.size()];
            }
            for(int i = 0; i < ll.size(); i++) {
                res[i] = ll.get(i);
            }
            return res;
        }
        private LinkedList<Integer> howSum(int target, int[] arr, LinkedList<LinkedList<Integer>> memo) {
            if(memo.contains(target)) {

            }
            if(target == 0)
                return new LinkedList<>();
            if(target < 0)
                return null;
            for(int num : arr) {
                LinkedList<Integer> res = howSum(target - num, arr, memo);
                if(res != null) {
                    res.add(num);
                    memo.add(res);
                    return res;
                }
            }
            memo.add(null);
            return null;
        }
    }

    static class Solver2 {
        public int[] tabulation(int target, int[] arr) {

            return null;
        }
    }
}