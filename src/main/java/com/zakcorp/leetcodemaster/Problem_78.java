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

    static class Solver1 {
        List<List<Integer>> result = new ArrayList<>();
        public List<List<Integer>> solve1(int[] arr) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            subcal(0, arr, list, res);
            return res;
        }

        private void subcal(int ind, int[] arr, List<Integer> list, List<List<Integer>> res) {
            if(ind >= arr.length) {
                res.add(new ArrayList<>(list));
                return;
            }
            subcal(ind + 1, arr, list, res);
            list.add(arr[ind]);
            subcal(ind + 1, arr, list, res);
            list.remove(arr[ind]);
        }
    }
}
