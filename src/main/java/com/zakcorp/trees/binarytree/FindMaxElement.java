package com.zakcorp.trees.binarytree;
import java.util.*;
public class FindMaxElement {
    static class Solver {
        public int findMax(BinaryTree.Node root) {
            final int[] max = new int[1];
            preOrder(max, root);
            return max[0];
        }
        public void preOrder(int[] max, BinaryTree.Node root) {
            if (root == null) {
                return;
            }
            max[0] = Math.max(max[0], root.data);
            preOrder(max, root.left);
            preOrder(max, root.right);
        }
    }
    static class Solver1 {
        public int findMax(BinaryTree.Node root) {
            int max = 0;
            Stack<BinaryTree.Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()) {
                BinaryTree.Node curr = stack.pop();
                max = Math.max(max, curr.data);
                if(curr.right != null) {
                    stack.push(curr.right);
                }
                if(curr.left != null) {
                    stack.push(curr.left);
                }
            }
            return max;
        }
    }
}
