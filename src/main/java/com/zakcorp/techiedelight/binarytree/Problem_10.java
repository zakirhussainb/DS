package com.zakcorp.techiedelight.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Problem_10 {
    /*
    Problem:- Print all nodes of a perfect binary tree in specific order.
    Description:- Given a binary tree, write an efficient algorithm to print all nodes of it in specific order.
    We need to print nodes of every level in alternating left and right.
    For Example:- There are two variations to this problem:-
        1. Print Top-Down
        2. Print Bottom-Up
    TODO:- Procedure for Top-Down:-
        1. Similar to Level Order Traversal.
        2. Use two Queues to maintain * Left Half of the Perfect BT and * Right Half of the Perfect BT
     */
    public static void main(String[] args) {
        Problem_10 problem_10 = new Problem_10();
        BinaryTreeImpl.Node root = problem_10.dataGeneration();
        Problem_10.Solver solver = new Problem_10.Solver();
        solver.printNodesInTopDown(root);
    }
    public BinaryTreeImpl.Node dataGeneration() {
        BinaryTreeImpl.Node root = new BinaryTreeImpl.Node(1);

        root.left = new BinaryTreeImpl.Node(2);
        root.right = new BinaryTreeImpl.Node(3);

        root.left.left = new BinaryTreeImpl.Node(4);
        root.left.right = new BinaryTreeImpl.Node(5);

        root.left.left.left = new BinaryTreeImpl.Node(8);
        root.left.left.right = new BinaryTreeImpl.Node(9);
        root.left.right.left = new BinaryTreeImpl.Node(10);
        root.left.right.right = new BinaryTreeImpl.Node(11);
        //********
        root.right.left = new BinaryTreeImpl.Node(6);
        root.right.right = new BinaryTreeImpl.Node(7);

        root.right.left.left = new BinaryTreeImpl.Node(12);
        root.right.left.right = new BinaryTreeImpl.Node(13);
        root.right.right.left = new BinaryTreeImpl.Node(14);
        root.right.right.right = new BinaryTreeImpl.Node(15);
        return root;
    }
    static class Solver {
        public void printNodesInTopDown(BinaryTreeImpl.Node root) {
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            Queue<BinaryTreeImpl.Node> q1 = new ArrayDeque<>();
            Queue<BinaryTreeImpl.Node> q2 = new ArrayDeque<>();
            q1.add(root.left);
            q2.add(root.right);
            while(!q1.isEmpty()){
                int size = q1.size();
                while(size --> 0){
                    BinaryTreeImpl.Node x = q1.poll();
                    System.out.print(x.data + " ");
                    if(x.left != null){
                        q1.add(x.left);
                    }
                    if(x.right != null){
                        q1.add(x.right);
                    }
                    BinaryTreeImpl.Node y = q2.poll();
                    System.out.print(y.data + " ");
                    if(y.right != null){
                        q2.add(y.right);
                    }
                    if(y.left != null){
                        q2.add(y.left);
                    }
                }
            }
        }
    }
}
