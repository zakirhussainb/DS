package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L11_SubsetsII
{
    /*
    Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
    The solution set must not contain duplicate subsets. Return the solution in any order.
     */
    public List<List<Integer>> subsetsWithoutDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, arr, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int index, int[] arr, List<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));
        for(int i = index; i < arr.length; i++) {
            if(i != index && arr[i] == arr[i - 1])
                continue;
            list.add(arr[i]);
            backtrack(i + 1, arr, list, result);
            list.remove(list.size() - 1);
        }
    }
}
