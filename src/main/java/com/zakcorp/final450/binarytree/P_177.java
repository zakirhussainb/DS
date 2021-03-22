package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P_177 {
    static class Solver {
        /* Boundary Traversal of a Binary Tree
        Remember three steps of traversal across the boundary in counter clockwise direction
        Step 1:- Traverse along the left boundary, capture all the nodes except leaf.
        Step 2:- Capture all the leaf nodes, perform inorder traversal of Binary Tree.
        Step 3:- Traverse along the right boundary, capture all the nodes except leaf.
         */
        public List<Integer> solve1(BinaryTree.Node root) {
            List<Integer> list = new ArrayList<>();
            list.add(root.data);
            leftBoundary(root.left, list);
            if( !root.isLeaf() ) {
                leafNodes(root, list);
            }
            rightBoundary(root.right, list);
            return list;
        }

        private void leftBoundary(BinaryTree.Node root, List<Integer> list) {
            if(root == null)
                return;
            if( !root.isLeaf() ) {
                list.add(root.data);
            }
            leftBoundary(root.left != null ? root.left : root.right, list);
        }
        private void leafNodes(BinaryTree.Node root, List<Integer> list) {
            if(root == null)
                return;
            leafNodes(root.left, list);
            if(root.isLeaf()) {
                list.add(root.data);
            }
            leafNodes(root.right, list);
        }
        private void rightBoundary(BinaryTree.Node root, List<Integer> list) {
            if(root == null)
                return;
            rightBoundary(root.right != null ? root.right : root.left, list);
            if( !root.isLeaf() ) {
                list.add(root.data);
            }
        }
    }
}
