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
}
