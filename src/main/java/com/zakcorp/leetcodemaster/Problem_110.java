package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

public class Problem_110 {
    /*
    This is a Bottom-Up strategy also known as Post-order traversal
    To check if a Binary Tree is Height Balanced -> You must know the following
        -> The absolute difference between the height of the left subtree and the right subtree
            should not be more than 1.
     */
    static class Solver {
        public boolean isBalanced(TreeNode root) {
            if (root == null)
                return true;
            return dfsHeight(root) != -1;
        }
        private int dfsHeight(TreeNode root) {
            if(root == null)
                return 0;
            int left = dfsHeight(root.left);
            int right = dfsHeight(root.right);
            // left or right subtree is unbalanced or curr tree is unbalanced
            if(left == -1 || right == -1)
                return -1;
            if( Math.abs(left - right) > 1)
                return -1;
            return Math.max(left, right) + 1;
        }
    }
}
