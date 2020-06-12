package com.zakcorp.leetcodemaster;

public class Problem_35 {
    static class Solver {
        public int searchInsert(int[] arr, int target) {
            if(target == 0)
                return target;
            int n = arr.length;
            int index = -1;
            int i;
            for(i = 0; i < n; i++) {
                if(arr[i] >= target) {
                    index = i;
                    break;
                }
            }
            return i == n ? n : index;
        }
    }
}
