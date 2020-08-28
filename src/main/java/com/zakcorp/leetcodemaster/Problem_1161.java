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

    /**
     * Using BreadthFirst Search and Maintaining a list to store the maxSum.
     */
    static class Solver {
        public int maxLevelSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            List<Integer> resultList = new ArrayList<>();
            while(!queue.isEmpty()) {
                int size = queue.size();
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
                resultList.add(sum);
            }
            int maxSum = Integer.MIN_VALUE;
            int index = -1;
            for(int i = 0; i < resultList.size(); i++) {
                if(resultList.get(i) > maxSum) {
                    maxSum = resultList.get(i);
                    index = i + 1;
                }
            }
            return index;
        }
    }
    /**
     * Using DepthFirst Search(PreOrder) and Maintaining a list to store the maxSum.
     */
    static class Solver1 {
        public int maxLevelSum(TreeNode root) {
            List<Integer> resultList = new ArrayList<>();
            dfs(root, 1, resultList);
            int maxSum = Integer.MIN_VALUE;
            int index = -1;
            for(int i = 0; i < resultList.size(); i++) {
                if(resultList.get(i) > maxSum) {
                    maxSum = resultList.get(i);
                    index = i + 1;
                }
            }
            return index;
        }
        public void dfs(TreeNode root, int level, List<Integer> resultList){
            if(root == null) {
                return;
            }
            if(resultList.size() < level) {
                resultList.add(root.val);
            } else {
                resultList.set(level - 1, resultList.get(level - 1) + root.val);
            }
            dfs(root.left, level+1, resultList);
            dfs(root.right, level+1, resultList);
        }

    }
}
