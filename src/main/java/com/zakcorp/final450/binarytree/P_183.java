package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class P_183 {
    // Check if a Binary Tree is a sum tree or not
    static class Solver {
        public boolean solve1(BinaryTree.Node root) {
            return sumTree(root) != Integer.MIN_VALUE;
        }
        private int sumTree(BinaryTree.Node root) {
            // if tree is empty return 0
            if(root == null)
                return 0;
            // if root is a leaf node
            if(root.left == null && root.right == null)
                return root.data;

            if( root.data == sumTree(root.left) + sumTree(root.right) ) {
                return 2 * root.data;
            }
            return Integer.MIN_VALUE;
        }
    }
}
