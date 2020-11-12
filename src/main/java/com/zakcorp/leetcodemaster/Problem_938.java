package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_938 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static class Solver {
        public int solve1(TreeNode root, int low, int high) {
            int[] sum = {0};
            preOrder(root, low, high, sum);
            return sum[0];
        }
        private void preOrder(TreeNode root, int low, int high, int[] sum) {
            if(root == null) {
                return;
            }
            if(root.val >= low && root.val <= high) {
                sum[0] += root.val;
            }
            if(root.val > low) {
                preOrder(root.left, low, high, sum);
            }
            if(root.val < high) {
                preOrder(root.right, low, high, sum);
            }
        }
    }
}
