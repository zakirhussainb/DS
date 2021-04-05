package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;

public class P_189 {
    /* Find Largest subtree sum in a tree */
    static class Solver {
        public int solve1(BinaryTree.Node root) {
            int[] maxSum = new int[]{Integer.MIN_VALUE};
            largestSubTreeSum(root, maxSum);
            return maxSum[0];
        }
        private int largestSubTreeSum(BinaryTree.Node root, int[] maxSum) {
            if(root == null)
                return 0;
            int leftSubTreeSum = largestSubTreeSum(root.left, maxSum);
            int rightSubTreeSum = largestSubTreeSum(root.right, maxSum);
            int currSum = root.data + leftSubTreeSum + rightSubTreeSum;
            maxSum[0] = Math.max(maxSum[0], currSum);
            return currSum;
        }
    }
}
