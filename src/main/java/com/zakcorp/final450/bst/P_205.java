package com.zakcorp.final450.bst;

import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;

public class P_205 {
    // Convert Binary tree into BST
    static class Solver {
        public BinaryTree.Node solve1(BinaryTree.Node root) {
            Set<Integer> set = new HashSet<>();
            inorder(root, set);
            Iterator<Integer> itr = set.iterator();
            convertToBST(root, itr);
            return root;
        }
        private void convertToBST(BinaryTree.Node root, Iterator<Integer> itr) {
            if(root == null)
                return;
            convertToBST(root.left, itr);
            root.data = itr.next();
            convertToBST(root.right, itr);
        }
        private void inorder(BinaryTree.Node root, Set<Integer> set) {
            if(root == null)
                return;
            inorder(root.left, set);
            set.add(root.data);
            inorder(root.right, set);
        }
    }
}
