package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_94 {
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
        public List<Integer> solve(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            inorder(root, list);
            return list;
        }
        private void inorder(TreeNode root, List<Integer> list) {
            if(root == null)
                return;
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }
    static class Solver1 {
        public List<Integer> solve(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;
            while(curr != null || !stack.isEmpty()) {
                while(curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }
                curr = stack.pop();
                list.add(curr.val);
                curr = curr.right;
            }
            return list;
        }
    }
}
