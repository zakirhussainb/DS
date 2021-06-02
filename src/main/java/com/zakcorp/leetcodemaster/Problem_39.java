package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_39 {
    static class Solver {
        public List<List<Integer>> solve1(int[] arr, int target) {
            List<List<Integer>> resultList = new ArrayList<>();
            LinkedList<Integer> list = new LinkedList<>();
            backtrack(arr, target, 0, list, resultList);
            return new ArrayList<>(resultList);
        }
        private void backtrack(int[] arr, int target, int start, LinkedList<Integer> list, List<List<Integer>> resultList ){
            if(target == 0) {
                resultList.add(new ArrayList<>(list));
                return;
            }
            for(int i = start; i < arr.length; i++) {
                int diff = target - arr[i];
                if(diff >= 0) {
                    list.add(arr[i]);
                    backtrack(arr, diff, i, list, resultList);
                    list.removeLast();
                }
            }
        }
    }
}
