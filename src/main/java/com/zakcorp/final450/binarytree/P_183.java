package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class P_183 {
    static class Solver {
        public boolean solve1(BinaryTree.Node root) {
            if(root == null)
                return false;
            int sum = 0;
            if(root.left != null) {
                sum += root.left.data;
            }
            if(root.right != null) {
                sum += root.right.data;
            }
            return root.data == sum;
        }
    }
}
