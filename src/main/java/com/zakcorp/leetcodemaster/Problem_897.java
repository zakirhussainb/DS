package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_897 {
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
    static class Solver1 {
        public TreeNode increasingBST(TreeNode root) {
            List<Integer> values = new ArrayList<>();
            inOrder(root, values);
            TreeNode result = new TreeNode(-1);
            TreeNode curr = result;
            for(int val : values) {
                curr.right = new TreeNode(val);
                curr = curr.right;
            }
            return result.right;
        }
        private void inOrder(TreeNode root, List<Integer> values) {
            if(root == null)
                return;
            inOrder(root.left, values);
            values.add(root.val);
            inOrder(root.right, values);
        }
    }
    static class Solver2 {
        TreeNode curr;
        public TreeNode increasingBST(TreeNode root) {
            TreeNode result = new TreeNode(-1);
            curr = result;
            inOrder(root, curr);
            return result.right;
        }
        private void inOrder(TreeNode root, TreeNode curr) {
            if(root == null)
                return;
            inOrder(root.left, curr);
            curr.right = new TreeNode(root.val);
            curr = curr.right;
            inOrder(root.right, curr);
        }
    }
}
