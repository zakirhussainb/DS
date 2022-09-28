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
        for(int i = index; i < arr.length; i++) {
            if(i > index && arr[i] == arr[i - 1])
                continue;
            if(arr[i] > target)
                break;
            list.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], result, list);
            list.remove(list.size() - 1);
        }
    }
}
