package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_46 {
    static class Solver1 {
        public List<List<Integer>> solve1(int[] arr) {
            List<List<Integer>> result = new ArrayList<>();
            boolean[] hash = new boolean[arr.length];
            backtrack(arr, new ArrayList<>(), result, hash);
            return result;
        }
        private void backtrack(int[] arr, List<Integer> list, List<List<Integer>> result, boolean[] hash) {
            if(list.size() >= arr.length) {
                result.add(new ArrayList<>(list));
                return;
            }
            for(int i = 0; i < arr.length; i++) {
                if ( !hash[i] ) {
                    list.add(arr[i]);
                    hash[i] = true;
                    backtrack(arr, list, result, hash);
                    list.remove(list.size() - 1);
                    hash[i] = false;
                }
            }
        }
    }
    static class Solver {
        public List<List<Integer>> solve1(int[] arr) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            for(int num : arr)
                list.add(num);

            int n = arr.length;
            backtrack(0, n, list, result);
            return result;
        }
        private void backtrack(int first, int n, List<Integer> list, List<List<Integer>> result) {
            if(first == n)
                result.add(new ArrayList<>(list));
            for(int i = first; i < n; i++) {
                Collections.swap(list, first, i);
                backtrack(first + 1, n, list, result);
                Collections.swap(list, first, i);
            }
        }
    }
}
