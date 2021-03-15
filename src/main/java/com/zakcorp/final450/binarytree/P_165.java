package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.concurrent.atomic.AtomicInteger;

public class P_165 {
    static class Solver {
        public int solve1(BinaryTree.Node root) {
            AtomicInteger diameter = new AtomicInteger(0);
            getDiameter(root, diameter);
            return diameter.get();
        }
        private int getDiameter(BinaryTree.Node root, AtomicInteger diameter) {
            if(root == null) {
                return 0;
            }
            int leftHeight = getDiameter(root.left, diameter);
            int rightHeight = getDiameter(root.right, diameter);

            int maxDiameter = leftHeight + rightHeight + 1;

            diameter.set( Math.max( diameter.get(), maxDiameter ) );

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    static class Solver1 {
        public int solve1(BinaryTree.Node root) {
            int[] res = new int[]{0};
            getDiameter(root, res);
            return res[0];
        }
        private int getDiameter(BinaryTree.Node root, int[] res) {
            if(root == null) {
                return 0;
            }
            int leftHeight = getDiameter(root.left, res);
            int rightHeight = getDiameter(root.right, res);

            int maxDiameter = leftHeight + rightHeight + 1;

            res[0] = Math.max(res[0], maxDiameter);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
