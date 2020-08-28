package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1161 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static class LevelSum {
        private int level;
        private int sum;
        public LevelSum(int level, int sum) {
            this.level = level;
            this.sum = sum;
        }
    }
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        List<LevelSum> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            int size = queue.size();
            LevelSum levelSum;
            int sum = 0;
            TreeNode t;
            while(size --> 0) {
                t = queue.poll();
                if(t.left != null) {
                    queue.add(t.left);
                }
                if(t.right != null) {
                    queue.add(t.right);
                }
                sum += t.val;
            }
            level++;
            levelSum = new LevelSum(level, sum);
            list.add(levelSum);
        }
        return list.get(list.size() - 1).level;
    }
}
