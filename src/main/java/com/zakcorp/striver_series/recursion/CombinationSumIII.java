package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIII {
    static class Solver {
        public List<List<Integer>> combinationSum3(int k, int sum) {
            int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
            List<List<Integer>> result = new ArrayList<>();
            combSum(0, arr, k, sum, new ArrayList<>(), result);
            return result;
        }
        private static void combSum(int ind, int[] arr, int k, int sum, List<Integer> list, List<List<Integer>> result) {
            if(list.size() == k) {
                if(sum == 0) {
                    result.add(new ArrayList<>(list));
                    return;
                }
                return;
            }
            if(ind >= arr.length) {
                return;
            }
            list.add(arr[ind]);
            combSum(ind + 1, arr, k, sum - arr[ind], list, result);
            list.remove(list.size() - 1);
            combSum(ind + 1, arr, k, sum, list, result);
        }
    }
}
