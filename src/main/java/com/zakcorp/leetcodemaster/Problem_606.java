package com.zakcorp.leetcodemaster;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Problem_606 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    static class Solver {
        public String tree2str(TreeNode t){
            StringBuilder sb = new StringBuilder();
            preorder(t, sb);
            return sb.toString();
        }
        public void preorder(TreeNode root, StringBuilder sb){
            if(root == null){
                return;
            }
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.addFirst(root);
            while (!queue.isEmpty()){
                TreeNode curr = queue.poll();
                sb.append(curr.val);
                if(curr.left != null){
                    sb.append("(");
                    queue.addFirst(curr.left);
                }
                if(curr.right != null){
                    queue.addLast(curr.right);
                }

            }
        }
    }
}
