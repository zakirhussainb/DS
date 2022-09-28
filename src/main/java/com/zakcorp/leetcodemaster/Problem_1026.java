package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

public class Problem_1026 {
    static class Solver {
        public int solve1(TreeNode root) {
            if(root == null)
                return 0;
            return preorder(root, root.val, root.val);
        }
        private int preorder(TreeNode root, int currMax, int currMin) {
            if(root == null) {
                return currMax - currMin;
            }
            currMax = Math.max(currMax, root.val);
            currMin = Math.min(currMin, root.val);
            int left = preorder(root.left, currMax, currMin);
            int right = preorder(root.right, currMax, currMin);
            return Math.max(left, right);
        }
    }
}
