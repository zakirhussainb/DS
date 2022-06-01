package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_114 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static class Solver {
        public void solve(TreeNode root) {
            if(root == null)
                return;
            if(root.left == null && root.right == null)
                return;
            List<TreeNode> list = new ArrayList<>();
            preOrder(list, root);
            TreeNode temp = root;
            for(TreeNode t : list) {
                temp.right = t;
                temp.left = null;
                temp = temp.right;
            }
        }
        public void preOrder(List<TreeNode> list, TreeNode root) {
            if(root == null)
                return;
            list.add(root);
            preOrder(list, root.left);
            preOrder(list, root.right);
        }
        public void preOrderPrint(TreeNode root) {
            if(root == null)
                return;
            System.out.print(root.val + "->");
            preOrderPrint(root.left);
            preOrderPrint(root.right);
        }
    }
}
