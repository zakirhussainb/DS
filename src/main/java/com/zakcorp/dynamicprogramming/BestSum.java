package com.zakcorp.dynamicprogramming;

import java.util.*;

/**
 * Created by Zakir Hussain B on 01/06/21.
 *
 * @source: Alvin's - https://youtu.be/oBt53YbR9Kk
 * @topic: Dynamic Programming
 * @sub-topic: Best Sum
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
/*
Write a function `bestSum(targetSum, arr)` that takes in a targetSum and an array of numbers as arguments.

The function should return an array containing the shortest combination of numbers that add up to exactly the targetSum.

If there is a tie for the shortest combination, you may return any one of the shortest.
 */
public class BestSum {
    // Recursive solution - TLE for larger inputs
    static class Solver {
        public List<Integer> bestSum(int target, int[] arr) {
            if (target == 0)
                return new ArrayList<>();
            List<Integer> shortestComb = null;
            for (int num : arr) {
                int diff = target - num;
                if (diff >= 0) {
                    List<Integer> currComb = bestSum(diff, arr);
                    if (currComb != null) {
                        currComb.add(num);
                        if (shortestComb == null || currComb.size() < shortestComb.size()) {
                            shortestComb = currComb;
                        }
                    }
                }
            }
            return shortestComb;
        }
    }

    // Memoized solution
    static class Solver1 {
        public List<Integer> bestSum(int target, int[] arr) {
            return bestSum1(target, arr, new HashMap<>());
        }

        public List<Integer> bestSum1(int target, int[] arr, HashMap<Integer, List<Integer>> map) {
            if (map.containsKey(target)) {
                return map.get(target);
            }
            if (target == 0) {
                return new ArrayList<>();
            }
            List<Integer> shortestCombination = null;
            for (int num : arr) {
                int diff = target - num;
                if (diff >= 0) {
                    List<Integer> combination = bestSum1(diff, arr, map);
                    if (combination != null) {
                        List<Integer> tempList = new ArrayList<>( combination );
                        tempList.add(num);
                        if (shortestCombination == null || tempList.size() < shortestCombination.size()) {
                            shortestCombination = tempList;
                        }
                    }
                }
            }
            map.put(target, shortestCombination);
            return shortestCombination;
        }
    }

    // Tabulation solution
    static class Solver2 {
        public List<Integer> bestSum(int target, int[] arr) {
            List<List<Integer>> dpList = new ArrayList<>();
            dpList.add(new ArrayList<>());
            for(int i = 0; i < target; i++) {
                dpList.add(null);
            }
            for(int i = 0; i < dpList.size(); i++) {
                if( dpList.get(i) != null ) {
                    for(int j = 0; j < arr.length; j++) {
                        int dpIndex = i + arr[j];
                        if(dpIndex < dpList.size()) {
                            List<Integer> innerList = new ArrayList<>( dpList.get(i) );
                            innerList.add(arr[j]);
                            if(dpList.get(dpIndex) == null || innerList.size() < dpList.get(dpIndex).size()) {
                                // Use "set" and don't use "add", because the list already contains the dpIndex(null)
                                dpList.set(dpIndex, innerList);
                            }
                        }
                    }
                }
            }
            return dpList.get(target);
        }
    }
}