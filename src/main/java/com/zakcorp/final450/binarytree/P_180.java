package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class P_180 {
    static class Solver {
        public BinaryTree.Node solve1(BinaryTree.Node root) {
            sumTree(root);
            return root;
        }
        private int sumTree(BinaryTree.Node root) {
            if(root == null)
                return 0;
            int val = root.data;
            root.data = sumTree(root.left) + sumTree(root.right);
            return root.data + val;
        }
    }
}
