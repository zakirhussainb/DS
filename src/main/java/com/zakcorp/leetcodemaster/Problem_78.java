package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_78 {
    /*static class Solver {
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
    }*/

    static class Solver1 {
        public List<List<Integer>> solve1(int[] arr) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            powerset(0, arr, list, res);
            return res;
        }

        private void powerset(int ind, int[] arr, List<Integer> list, List<List<Integer>> res) {
            if(ind >= arr.length) {
                res.add(new ArrayList<>(list));
                return;
            }
            list.add(arr[ind]);
            powerset(ind + 1, arr, list, res);
            list.remove(list.size() - 1);
            powerset(ind + 1, arr, list, res);
        }
    }
}
