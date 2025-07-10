package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsI {
    static class Solver {
        public List<Integer> subsetSums(int[] arr) {
            List<Integer> res = new ArrayList<>();
            subset(0, arr, 0, res);
            return res;
        }
        private static void subset(int ind, int[] arr, int sum, List<Integer> res) {
            if(ind >= arr.length) {
                res.add(sum);
                return;
            }
            subset(ind + 1, arr, sum + arr[ind], res);
            subset(ind + 1, arr, sum, res);
        }
    }
}
