package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_1038
{
    /*
    Using Recursion
     */
    static class Solver {
        public TreeNode solve1(TreeNode root) {
            reverseInOrder(root, new int[]{0});
            return root;
        }
        private void reverseInOrder(TreeNode root, int[] sum) {
            if(root == null)
                return;
            reverseInOrder( root.right, sum );
            sum[0] += root.val;
            root.val = sum[0];
            reverseInOrder( root.left, sum );
        }
    }

    static class Solver1 {
        public TreeNode solve1(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;
            int sum = 0;
            while(!stack.isEmpty() || curr != null) {
                if(curr != null) {
                    stack.push( curr );
                    curr = curr.right;
                } else {
                    curr = stack.pop();
                    sum += curr.val;
                    curr.val  = sum;
                    curr = curr.left;
                }
            }
            return root;
        }
    }
}
