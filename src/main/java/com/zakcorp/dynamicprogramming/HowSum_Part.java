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
    /*static class Solver1 {
        public List<Integer> howSum(int target, int[] arr) {
            List<Integer> result = new ArrayList<>();
            int[] memo = new int[arr.length + 1];
            howSum(target, arr, memo, result);
            return result;
        }
        private List<Integer> howSum(int target, int[] arr, int[] memo, List<Integer> result) {
            if(memo[target] != 0) {

            }
            if(target == 0) {
                return result;
            }
            if(target < 0) {
                return null;
            }
            for (int num : arr) {
                int diff = target - num;
                List<Integer> res = howSum(diff, arr, memo, result);
                if (res != null) {
                    result.add(num);
                    return result;
                }
            }
            return null;
        }
    }*/
}
