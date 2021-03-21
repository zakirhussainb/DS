package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.concurrent.atomic.AtomicBoolean;

public class P_175 {
    static class Solver {
        public boolean solve1(BinaryTree.Node root) {
            AtomicBoolean isBalanced = new AtomicBoolean(true);
            isHeightBalanced(root, isBalanced);
            return isBalanced.get();
        }
        private int isHeightBalanced(BinaryTree.Node root, AtomicBoolean isBalanced) {
            if(root == null || !isBalanced.get()) {
                return 0;
            }
            int leftHeight = isHeightBalanced(root.left, isBalanced);
            int rightHeight = isHeightBalanced(root.right, isBalanced);

            // for a binary tree to be height balanced the difference between the left and right subtrees must not be more than 1
            if(Math.abs(leftHeight - rightHeight) > 1) {
                isBalanced.set(false);
            }

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
