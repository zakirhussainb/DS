package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.Stack;

public class Problem_230 {
    // This is a DFS recursive solution.
    static class Solver {
        private int ans = 0;
        private int count = 0;
        public int dfsRecursive(TreeNode root, int k) {
            count = k;
            inorder(root);
            return ans;
        }
        private void inorder(TreeNode root) {
            if(root == null)
                return;
            inorder(root.left);
            count--;
            if(count == 0) {
                ans = root.val;
                return;
            }
            inorder(root.right);
        }
    }
    // This is a DFS Iterative solution.
    static class Solver1 {
        public int dfsIterative(TreeNode root, int k) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;
            int count = 0;
            int ans = -1;
            while(!stack.isEmpty() || curr != null) {
                while(curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }
                curr = stack.pop();
                count++;
                if(count == k) {
                    ans = curr.val;
                    return ans;
                }
                curr = curr.right;
            }
            return ans;
        }
    }
}
