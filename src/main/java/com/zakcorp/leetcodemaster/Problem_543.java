package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_543 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    static class Solver {
        public int diameterOfBinaryTree(TreeNode root) {
            Solver solver = new Solver();
//            return solver.OofNSquare(root);
            int[] diameter = new int[]{0};
//            return solver.OofNSquare(root);
            solver.OofN(root, diameter);
            return diameter[0];
        }

        public int OofNSquare(TreeNode root) {
            if(root == null)
                return 0;
            int lHeight = getHeight(root.left);
            int rHeight = getHeight(root.right);

            int lDiameter = OofNSquare(root.left);
            int rDiameter = OofNSquare(root.right);

            return Math.max(lHeight + rHeight + 1,
                    Math.max(lDiameter, rDiameter) );
        }
        public int OofN(TreeNode root, int[] diameter) {
            if(root == null){
                return 0;
            }
            int lHeight = OofN(root.left, diameter);
            int rHeight = OofN(root.right, diameter);
            diameter[0] = Math.max(diameter[0], lHeight + rHeight);
            return Math.max(lHeight, rHeight) + 1;
        }
        public int getHeight(TreeNode root){
            if(root != null){
                return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
            }
            return 0;
        }
    }
}
