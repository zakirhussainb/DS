package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L9_CombinationSumII
{
    /*
    Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations
    in candidates where the candidate numbers sum to target.
    Each number in candidates may only be used once in the combination.
    Note: The solution set must not contain duplicate combinations.
     */
    static class Solver {
        public List<List<Integer>> combinationSum2(int[] arr, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(arr);
            findCombinations(0, arr, target, result, new ArrayList<>());
            return result;
        }
        private void findCombinations(int index, int[] arr, int target, List<List<Integer>> result, List<Integer> list) {
            if(target == 0) {
                result.add(new ArrayList<>(list));
                return;
            }
            if(target < 0 || index >= arr.length) {
                return;
            }
            list.add(arr[index]);
            findCombinations(index + 1, arr, target - arr[index], result, list);
            list.remove(list.size() - 1);
            for(int i = index + 1; i < arr.length; i++) {
                if(arr[i] != arr[index]) {
                    findCombinations(i, arr, target, result, list);
                    break;
                }
            }
        }
    }
}
