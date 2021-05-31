package com.zakcorp.dynamicprogramming;

import java.util.*;

public class HowSum_Part {
    static class Solver {
        public List<Integer> howSum(int target, int[] arr) {
            if(target == 0){
                return new ArrayList<>();
            }
            if(target < 0){
                return null;
            }
            for (int num : arr) {
                int diff = target - num;
                List<Integer> result = howSum(diff, arr);
                if ( result != null) {
                    result.add(num);
                    return result;
                }
            }
            return null;
        }
    }
    static class Solver1 {
        public List<Integer> howSum(int target, int[] arr) {
            return howSum(target, arr, new HashMap<>());
        }
        private List<Integer> howSum(int target, int[] arr, HashMap<Integer, List<Integer>> memo) {
            if(memo.containsKey(target)) {
                return memo.get(target);
            }
            if(target == 0) {
                return new ArrayList<>();
            }
            if(target < 0) {
                return null;
            }
            for(int num : arr) {
                int diff = target - num;
                List<Integer> result = howSum(diff, arr, memo);
                if(result != null) {
                    result.add(num);
                    memo.put(num, result);
                    return memo.get(num);
                }
            }
            memo.put(target, null);
            return memo.get(target);
        }
    }
}
