package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1389 {
    static class Solver {
        public int[] createTargetArray(int[] nums, int[] index) {
            int n = nums.length;
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(index[i], nums[i]);
            }
            return list.stream().mapToInt(i->i).toArray();
        }
    }
    static class Solver1 {
        public int[] createTargetArray(int[] nums, int[] index) {
            int n = nums.length;
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < n; i++){
                list.add(index[i], nums[i]);
            }
            return list.stream().mapToInt(i->i).toArray();
        }
    }
    static class Solver2 {
        public int[] createTargetArray(int[] nums, int[] index) {
            int n = nums.length;
            int[] target = new int[n];
            for(int i = 0; i < n; i++){
                if(target[index[i]] != 0) {
                    shiftElements(target, index[i], n);
                }
                target[index[i]] = nums[i];
            }
            return target;
        }

        private void shiftElements(int[] target, int index, int n) {
            for(int i = n - 2; i >= index; i--) {
               target[i + 1] = target[i];
            }
//            if (n - 1 - index >= 0) System.arraycopy(target, index, target, index + 1, n - 1 - index);
        }
    }
}
