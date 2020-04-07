package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_112 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    static class Solver {
        public static class Pair<U, V> {
            U first;
            V second;
            public Pair(U first, V second) {
                this.first = first;
                this.second = second;
            }
            public static <U, V> Pair <U, V> of(U a, V b) {
                return new Pair<>(a, b);
            }
        }
        protected boolean preOrderRecursive(TreeNode root, int target) {
            if(root == null){
                return false;
            }
            if(root.left == null && root.right == null){
                return target == root.val;
            }
            return preOrderRecursive(root.left, target - root.val) ||
                    preOrderRecursive(root.right, target - root.val);
        }
        // This iterative approach is same as using two stacks
        protected boolean preOrderIterative(TreeNode root, int target) {
            if(root == null){
                return false;
            }
            Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
            stack.push(Pair.of(root, root.val));
            while (!stack.isEmpty()) {
                Pair<TreeNode, Integer> pair = stack.pop();
                TreeNode curr = pair.first;
                int value = pair.second;
                if(curr.left == null && curr.right == null && target == value){
                    return true;
                } else {
                    if(curr.right != null){
                        stack.push(Pair.of(curr.right, curr.right.val + value));
                    }
                    if(curr.left != null) {
                        stack.push(Pair.of(curr.left, curr.left.val + value));
                    }
                }
            }
            return false;
        }
    }
}
