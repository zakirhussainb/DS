package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.List;

public class L8_CombinationSum
{
    public List<List<Integer>> getAllCombinationsWhoseSumIsTarget(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0, arr, target, result, new ArrayList<>());
        return result;
    }
    private void findCombinations(int index, int[] arr, int target, List<List<Integer>> result, List<Integer> list) {
        if(index >= arr.length) {
            if(target == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index] <= target) {
            list.add(arr[index]);
            findCombinations(index, arr, target - arr[index], result, list);
            list.remove(list.size() - 1);
        }
        findCombinations(index + 1, arr, target, result, list);
    }
}
