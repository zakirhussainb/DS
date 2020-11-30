package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1302 {
    static class Solver {
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
        public int deepestLeavesSum(TreeNode root) {
            int height = getHeight(root);
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 1;
            int ans = 0;
            while( !queue.isEmpty() ) {
                int size = queue.size();
                while(size --> 0) {
                    TreeNode curr = queue.poll();
                    if(level == height) {
                        ans += curr.val;
                    }
                    if(curr.left != null)
                        queue.add(curr.left);
                    if(curr.right != null)
                        queue.add(curr.right);
                }
                level++;
            }
            return ans;
        }
        private int getHeight(TreeNode root) {
            if(root == null)
                return 0;
            return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        }
    }
}
