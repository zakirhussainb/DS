package com.zakcorp.gfgmaster;

import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PANTDHS {
//    https://practice.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1
    static class Solver {
        public String solve(BinaryTree.Node root) {
            StringBuilder sb = new StringBuilder();
            Queue<BinaryTree.Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                while(size --> 0) {
                    BinaryTree.Node curr = queue.poll();
                    if(curr.left != null && curr.right == null) {
                        sb.append(curr.left.data).append(" ");
                        queue.add(curr.left);
                    }
                    else if(curr.left == null && curr.right != null) {
                        sb.append(curr.right.data).append(" ");
                        queue.add(curr.right);
                    } else {
                        queue.add(curr.left);
                        queue.add(curr.right);
                    }
                }
            }
            return sb.toString().trim();
        }
    }
}
