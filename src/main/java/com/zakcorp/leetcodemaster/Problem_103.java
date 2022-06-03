package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_103 {
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
        public List<List<Integer>> solve1(TreeNode root) {
            if(root == null)
                return new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 1;
            while(!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                while(size --> 0) {
                    TreeNode curr = queue.poll();
                    if(level % 2 == 0) {
                        list.add(0, curr.val);
                    } else {
                        list.add(curr.val);
                    }
                    if(curr.left != null)
                        queue.add(curr.left);
                    if(curr.right != null)
                        queue.add(curr.right);
                }
                level++;
                result.add(list);
            }
            return result;
        }
    }
    static class Solver1 {
        public List<List<Integer>> solve1(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if(root == null)
                return result;
            preorder(root, result, 0);
            return result;
        }
        private void preorder(TreeNode root, List<List<Integer>> result, int level) {
            if(root == null)
                return;
            if(result.size() <= level) {
                result.add(new ArrayList<>());
            }
            List<Integer> collection = result.get(level);
            if(level % 2 == 0)
                collection.add(root.val);
            else
                collection.add(0, root.val);

            preorder(root.left, result, level + 1);
            preorder(root.right, result, level + 1);
        }
    }
}
