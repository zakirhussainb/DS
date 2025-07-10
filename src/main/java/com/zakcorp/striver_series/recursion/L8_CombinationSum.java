package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.List;

public class L8_CombinationSum
{
    public List<List<Integer>> getAllCombinationsWhoseSumIsTarget(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0, arr, target, new ArrayList<>(), result);
        return result;
    }
    private void findCombinations(int index, int[] arr, int target, List<Integer> list, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if(index >= arr.length || target < 0) {
            return;
        }
        list.add(arr[index]);
        findCombinations(index, arr, target - arr[index], list, result);
        list.remove(list.size() - 1);
        findCombinations(index + 1, arr, target, list, result);
    }
}
