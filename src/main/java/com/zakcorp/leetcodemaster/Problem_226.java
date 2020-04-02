package com.zakcorp.leetcodemaster;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Problem_226 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    static class Solver {
        public TreeNode recursive(TreeNode root) {
            if(root == null){
                return null;
            }
            TreeNode right = recursive(root.right);
            TreeNode left = recursive(root.left);
            root.left = right;
            root.right = left;
            return root;
        }
        public TreeNode iterative(TreeNode root) {
            if(root == null){
                return null;
            }
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()){
                TreeNode curr = queue.poll();
                // Swap Left and Right Children of the Current Node
                TreeNode temp = curr.left;
                curr.left = curr.right;
                curr.right = temp;
                // If not null add them to queue
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }
            return root;
        }
    }
}
