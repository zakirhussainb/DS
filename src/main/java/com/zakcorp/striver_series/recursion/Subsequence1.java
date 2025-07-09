package com.zakcorp.striver_series.recursion;

import java.util.*;

// Striver series - Check if there exists a subsequence with sum K

public class Subsequence1 {
    static class Solver {
        public boolean checkSubsequenceSum(int[] nums, int k) {
            return subsequence(0, nums, k);
        }
        private boolean subsequence(int index, int[] nums, int k) {
            if(k == 0) {
                return true;
            }
            if(k < 0 || index >= nums.length) {
                return false;
            }
            return subsequence(index + 1, nums, k - nums[index]) ||
                    subsequence(index + 1, nums, k) ;
        }
    }
}
