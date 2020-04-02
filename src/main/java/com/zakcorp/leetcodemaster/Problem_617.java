package com.zakcorp.leetcodemaster;

import java.util.Stack;

public class Problem_617 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
//    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        Solver solver = new Solver();
////        return solver.recursive(t1, t2);
//        return solver.iterative(t1, t2);
//    }
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
        public TreeNode recursive(TreeNode t1, TreeNode t2) {
            if(t1 == null && t2 != null){
                return t2;
            }
            if(t1 != null && t2 == null){
                return t1;
            }
            if(t1 == null){
                return null;
            }
            t1.val = t1.val + t2.val;
            t1.left = recursive(t1.left, t2.left);
            t1.right = recursive(t1.right, t2.right);
            return t1;
        }
        public TreeNode iterative(TreeNode t1, TreeNode t2) {
            if(t1 == null){
                return t2;
            }
            Stack<Pair<TreeNode, TreeNode>> stack = new Stack<>();
            stack.push(Solver.Pair.of(t1, t2));
            while (!stack.isEmpty()){
                Pair<TreeNode, TreeNode> pair = stack.pop();
                if(pair.first == null || pair.second == null){
                    continue;
                }
                pair.first.val = pair.first.val + pair.second.val;
                if(pair.first.left != null){
                    stack.push(Pair.of(pair.first.left, pair.second.left));
                } else {
                    pair.first.left = pair.second.left;
                }
                if(pair.first.right != null){
                    stack.push(Pair.of(pair.first.right, pair.second.right));
                } else {
                    pair.first.right = pair.second.right;
                }
            }
            return t1;
        }
    }
}
