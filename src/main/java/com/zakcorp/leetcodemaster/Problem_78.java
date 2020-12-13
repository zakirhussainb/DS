package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_78 {
    static class Solver {
        List<List<Integer>> result = new ArrayList<>();
        public List<List<Integer>> solve1(int[] arr) {
            Arrays.sort(arr);
            backtrack(new ArrayList<>(), arr, 0);
            return result;
        }
        private void backtrack(List<Integer> list, int[] arr, int start) {
            result.add(new ArrayList<>(list));
            for(int i = start; i < arr.length; i++) {
                list.add(arr[i]);
                backtrack(list, arr, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
