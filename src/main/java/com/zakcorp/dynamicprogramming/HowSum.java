package com.zakcorp.dynamicprogramming;

import java.util.*;

/**
 * Created by Zakir Hussain B on 02/01/21.
 *
 * @source: Alvin's - https://youtu.be/oBt53YbR9Kk
 * @topic: Dynamic Programming
 * @sub-topic: How Sum
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
        public LinkedList<Integer> recursive(int target, int[] arr) {
            if(target == 0)
                return new LinkedList<>();
            if(target < 0)
                return null;
            for(int num : arr) {
                LinkedList<Integer> res = recursive(target - num, arr);
                if( res != null ) {
                    res.add(num);
                    return res;
                }
            }
            return null;
        }
    }

    static class Solver1 {
        public LinkedList<Integer> memoized(int target, int[] arr) {
            return memoized(target, arr, new HashMap<>());
        }
        private LinkedList<Integer> memoized(int target, int[] arr, HashMap<Integer, LinkedList<Integer>> memo) {
            if(memo.containsKey(target)) {
                return memo.get(target);
            }
            if(target == 0)
                return new LinkedList<>();
            if(target < 0)
                return null;
            for(int num : arr) {
                LinkedList<Integer> res = memoized(target - num, arr, memo);
                if(res != null) {
                    res.add(num);
                    memo.put(num, res);
                    return res;
                }
            }
            memo.put(target, null);
            return null;
        }
    }

    static class Solver2 {
        public List<Integer> tabulation(int target, int[] arr) {
            List<List<Integer>> dp = new ArrayList<>();
            dp.add(new ArrayList<>());
            for(int i = 0; i < target; i++) {
                dp.add(null);
            }
            for(int i = 0; i < dp.size(); i++) {
                if(dp.get(i) != null) {
                    for(int j = 0; j < arr.length; j++) {
                        int dpIndex = i + arr[j];
                        if(dpIndex < dp.size()) {
                            List<Integer> innerList = new ArrayList<>(dp.get(i));
                            innerList.add(0, arr[j]);
                            if(dpIndex == target) {
                                return innerList;
                            }
                            dp.set(dpIndex, innerList);
                        }
                    }
                }
            }
            return null;
        }
    }
}