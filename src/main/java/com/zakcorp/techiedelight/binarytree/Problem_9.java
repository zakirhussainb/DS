package com.zakcorp.techiedelight.binarytree;

import java.util.*;

public class Problem_9 {
    /*
    Problem:- Reverse Level Order traversal of a Binary Tree
    Description:- Given a binary tree, print its nodes level by level in reverse order; i.e. all nodes present at the
    last level should be printed first followed by nodes of second-last level and so on. All nodes for any level should
    be printed from left to right.
    TODO:- Procedure:-
        1. Similar to Level Order Traversal.
        2. Use a Queue to store the traversed nodes.
        3. Create an auxiliary Stack to maintain the output data.
        4. The only difference is here you check first for the right child and then the left child and push to the queue.
     */
    public static void main(String[] args) {
        Problem_9 problem_9 = new Problem_9();
        BinaryTreeImpl.Node root = problem_9.dataGeneration();
//        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
//        binaryTree.preorder(root);
        Problem_9.Solver solver = new Problem_9.Solver();
        solver.reverseLevelOrder(root);
    }
    public BinaryTreeImpl.Node dataGeneration() {
        BinaryTreeImpl.Node root = new BinaryTreeImpl.Node(8);
        root.left = new BinaryTreeImpl.Node(3);
        root.right = new BinaryTreeImpl.Node(4);
        root.left.left = new BinaryTreeImpl.Node(7);
        root.left.left.left = new BinaryTreeImpl.Node(18);
        root.left.left.right = new BinaryTreeImpl.Node(9);
        root.right.left = new BinaryTreeImpl.Node(5);
        root.right.right = new BinaryTreeImpl.Node(6);
        root.right.left.left = new BinaryTreeImpl.Node(14);
        root.right.left.left.right = new BinaryTreeImpl.Node(25);
        return root;
    }
    static class Solver {
        public void reverseLevelOrder(BinaryTreeImpl.Node root){
            if(root == null){
                return;
            }
            Queue<BinaryTreeImpl.Node> queue = new ArrayDeque<>();
            queue.add(root);
            Stack<Integer> stack = new Stack<>();
            while(!queue.isEmpty()){
                BinaryTreeImpl.Node curr = queue.poll();
                stack.push(curr.data);
                if(curr.right != null){
                    queue.add(curr.right);
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
            }
            while (!stack.isEmpty()){
                System.out.print(stack.pop() + " ");
            }
        }
    }
}
