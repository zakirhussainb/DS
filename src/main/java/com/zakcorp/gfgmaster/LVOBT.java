package com.zakcorp.gfgmaster;

import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;

public class LVOBT {
    /* https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1 */
    static class Solver {
        public String solve(BinaryTree.Node root) {
            StringBuilder sb = new StringBuilder();
            Queue<BinaryTree.Node> queue = new ArrayDeque<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                int i = 0;
                while(size --> 0) {
                    BinaryTree.Node curr = queue.poll();
                    if(i == 0){
                        sb.append(curr.data).append(" ");
                    }
                    if(curr.left != null) {
                        queue.add(curr.left);
                    }
                    if(curr.right != null) {
                        queue.add(curr.right);
                    }
                    i++;
                }
            }
            return sb.toString().trim();
        }
    }
}
