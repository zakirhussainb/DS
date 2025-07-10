package com.zakcorp.striver_series.recursion;

// Striver series - Check if there exists a subsequence with sum K

public class Subsequence2 {
    static class Solver {

        public int countSubsequenceWithTargetSum(int[] nums, int k) {
            int[] ans = new int[]{0};
            subsequence(0, nums, k, ans);
            return ans[0];
        }
        private void subsequence(int index, int[] nums, int k, int[] ans) {
            if(k == 0) {
                ans[0]++;
                return;
            }
            if(k < 0 || index >= nums.length) {
                return;
            }

            subsequence(index + 1, nums, k - nums[index], ans);
            subsequence(index + 1, nums, k, ans);
        }
    }

    // More elegant solution
    static class Solver1 {

        public int countSubsequenceWithTargetSum(int[] nums, int k) {
            return subsequence(0, nums, k);
        }
        private int subsequence(int index, int[] nums, int k) {
            if(k == 0) {
                return 1;
            }
            if(k < 0 || index >= nums.length) {
                return 0;
            }

            int path1 = subsequence(index + 1, nums, k - nums[index]);
            int path2 = subsequence(index + 1, nums, k);
            return path1 + path2;
        }
    }
}
