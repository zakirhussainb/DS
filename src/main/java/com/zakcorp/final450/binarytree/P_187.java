package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;

public class P_187 {
    /* Sum of Nodes on the Longest path from root to leaf node */
    static class Solver {
        public int solve1(BinaryTree.Node root) {
            if(root == null)
                return 0;
            int[] maxSum = new int[]{Integer.MIN_VALUE};
            int[] maxLen  = new int[]{0};

            sumOfLongRootToLeafPath(root, 0, 0, maxSum, maxLen);

            return maxSum[0];
        }
        private void sumOfLongRootToLeafPath(BinaryTree.Node root, int sum, int len, int[] maxSum, int[] maxLen) {
            if(root == null) {
                if(maxLen[0] <= len) {
                    maxLen[0] = len;
                    maxSum[0] = sum;
                }
                return;
            }
            sumOfLongRootToLeafPath(root.left, sum + root.data, len + 1, maxSum, maxLen);
            sumOfLongRootToLeafPath(root.right, sum + root.data, len + 1, maxSum, maxLen);
        }
    }
}
