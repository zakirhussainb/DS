package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.concurrent.atomic.AtomicInteger;

public class P_166 {
    static class Solver {
        /* Here, we are just swapping the left node with the right node for each and every child/node in the tree
        Create a recursive function, where
        Step 1:- Swap the left of the root with that of right of the root.
        Step 2:- If root's left child is not null, then recurse for left of the root.
        Step 3:- If root's right child is not null, then recurse for the right of the root.
        */
        public BinaryTree.Node solve1(BinaryTree.Node root) {
            if(root == null)
                return null;
            BinaryTree.Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            if(root.left != null) {
                solve1(root.left);
            }

            if(root.right != null) {
                solve1(root.right);
            }

            return root;
        }
    }

    static class Solver1 {
        /*  just swapping the left node with the right node for each and every child/node in the tree
        Create a recursive function, where
        Step 1:- we need to create a mirror tree with the current root val
        Step 2:- then attach the result of mirrorifys root left to the mirror node's right
        Step 3:- and attach the result of mirrorifys root right to the mirror node's left
        */
        public BinaryTree.Node solve1(BinaryTree.Node root) {
            if(root == null)
                return null;
            BinaryTree.Node mirror = new BinaryTree.Node(root.data);
            mirror.left = solve1(root.right);
            mirror.right = solve1(root.left);
            return mirror;
        }
    }
}
