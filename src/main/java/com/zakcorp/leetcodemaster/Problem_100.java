package com.zakcorp.leetcodemaster;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem_100 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    static class Solver {
        static class Pair<U, V> {
            U first;
            V second;
            public Pair(U first, V second){
                this.first = first;
                this.second = second;
            }
            public static <U, V> Pair <U, V> of(U a, V b){
                return new Pair<>(a, b);
            }
        }
        public boolean recursive(TreeNode p, TreeNode q) {
            // When Both trees are empty
            if (p == null && q == null){
                return true;
            }
            return (p != null && q != null) && (p.val == q.val)
                    && recursive(p.left, q.left)
                    && recursive(p.right, q.right);
        }
        public boolean iterative(TreeNode p, TreeNode q) {
            // If both trees are empty, they are identical
            if(p == null && q == null){
                return true;
            }
            if(p == null){
                return false;
            }
            if(q == null){
                return false;
            }
            Queue<Pair<TreeNode, TreeNode>> queue = new ArrayDeque<>();
            queue.add(Pair.of(p, q));
            while (!queue.isEmpty()) {
                p = queue.peek().first;
                q = queue.peek().second;
                queue.poll();
                if(p.val != q.val){
                    return false;
                }
                if(p.left != null && q.left != null){
                    queue.add(Pair.of(p.left, q.left));
                } else if(p.left != null || q.left != null) {
                    return false;
                }
                if(p.right != null && q.right != null){
                    queue.add(Pair.of(p.right, q.right));
                } else if(p.right != null || q.right != null) {
                    return false;
                }
            }
            return true;
        }
    }
}
