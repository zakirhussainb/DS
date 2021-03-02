package com.zakcorp.final450.searchingandsorting;

import java.util.*;

/* Reverse the array */
public class P_100 {
    // Problem is incomplete, not understood, as it is hard
    static class Solver {
        public List<List<Integer>> solve1(int[] arr, int target)
        {
            Arrays.sort(arr);
            return kSum(arr, target, 0, 4);
        }
        public List<List<Integer>> kSum(int[] arr, int target, int start, int k) {
            List<List<Integer>> res = new ArrayList<>();
            if (start == arr.length || arr[start] * k > target || target > arr[arr.length - 1] * k)
                return res;
            if (k == 2)
                return twoSum(arr, target, start);
            for (int i = start; i < arr.length; ++i)
                if (i == start || arr[i - 1] != arr[i])
                    for ( List<Integer> set : kSum( arr, target - arr[i], i + 1, k - 1 ) ) {
                        res.add(new ArrayList<>(Collections.singletonList(arr[i])));
                        res.get(res.size() - 1).addAll(set);
                    }
            return res;
        }
        public List<List<Integer>> twoSum(int[] arr, int target, int start) {
            List<List<Integer>> res = new ArrayList<>();
            int lo = start, hi = arr.length - 1;
            while (lo < hi) {
                int sum = arr[lo] + arr[hi];
                if (sum < target || (lo > start && arr[lo] == arr[lo - 1]))
                    ++lo;
                else if (sum > target || (hi < arr.length - 1 && arr[hi] == arr[hi + 1]))
                    --hi;
                else
                    res.add(Arrays.asList(arr[lo++], arr[hi--]));
            }
            return res;
        }
    }
}
