package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;

public class P_196 {
    /* Check if two tree are isomorphic
    What is meant by isomorphism ?
    1. Two trees are called isomorphic if one of them can be obtained from other by a series of flips,
    i.e. by swapping left and right children of a number of nodes.
    2. Even when two trees are same in structure, they are still isomorphic in nature.
    Note:- Being isomorphic is different from mirror/symmetric tree */
    static class Solver {
        public boolean solve1(BinaryTree.Node t1, BinaryTree.Node t2) {
            if(t1 == null && t2 == null)
                return true;

            if(t1 == null || t2 == null)
                return false;

            if(t1.data != t2.data)
                return false;

            // Case 1: The subtrees rooted at these nodes have NOT been "Flipped".
            // Case 2: The subtrees rooted at these nodes have been "Flipped"
            return ( ( solve1(t1.left, t2.left) && solve1(t1.right, t2.right) )
                    || ( solve1(t1.left, t2.right) && solve1(t1.right, t2.left) )
            );
        }
    }
}
