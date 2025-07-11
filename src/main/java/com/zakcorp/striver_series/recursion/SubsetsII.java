package com.zakcorp.striver_series.recursion;

import java.util.*;

public class SubsetsII {
    static class Solver {
        public List<List<Integer>> subsetsWithDup(int[] arr) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(arr);
            subset2(0, arr, new ArrayList<>(), result);
            return result;
        }
        private static void subset2(int ind, int[] arr, List<Integer> list, List<List<Integer>> result) {
            if(ind >= arr.length) {
                result.add(new ArrayList<>(list));
                return;
            }
            list.add(arr[ind]);
            subset2(ind + 1, arr, list, result);
            list.remove(list.size() - 1);
            for(int i = ind + 1; i < arr.length; i++) {
                if(arr[i] != arr[ind]) {
                    subset2(i, arr, list, result);
                    return;
                }
            }
            // Ensure the function finishes when no more unique elements are left
            subset2(arr.length, arr, list, result);
        }
    }
}
