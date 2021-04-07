package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;

public class P_196 {
    /* Check if two tree are isomorphic
     Note:- Being isomorphic is different from mirror/symmetric tree */
    static class Solver {
        public boolean solve1(BinaryTree.Node t1, BinaryTree.Node t2) {
            if(t1 == null && t2 == null)
                return true;

            if(t1 == null || t2 == null)
                return false;

            if(t1.data != t2.data)
                return false;

            return ( ( solve1(t1.left, t2.left) && solve1(t1.right, t2.right) )
                    || ( solve1(t1.left, t2.right) && solve1(t1.right, t2.left) )
            );
        }
    }
}
