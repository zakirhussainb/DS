package com.zakcorp.techiedelight.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Problem_8 {
    /*
    Problem:- Spiral Order traversal of a Binary Tree
    Description:- Given a binary tree, write an efficient algorithm to traverse the tree in a spiral order fashion.
    Idea:- The idea is to use a Deque, and utilize a flag to toggle between spiral orders.
    TODO:- Procedure:-
        1. Add root to the first position of a Deque.
        2. Initialize a boolean flag = false.
        3. While the Deque is not Empty, perform traversal.
            3.1 Calculate deque size -> size = deque.size();
            3.2 Check if flag is true.
                3.2.1
            3.3 Else flag is false
            3.4 Flip the flag -> flag != flag
     */
    public static void main(String[] args) {
        Problem_8 problem_8 = new Problem_8();
        Problem_8.Solver.Node root = problem_8.dataGeneration();
        Problem_8.Solver solver = new Problem_8.Solver();
        solver.spiralOrder(root);
    }
    public Problem_8.Solver.Node dataGeneration() {
        Problem_8.Solver.Node root = new Problem_8.Solver.Node(8);
        root.left = new Problem_8.Solver.Node(3);
        root.right = new Problem_8.Solver.Node(4);
        root.left.left = new Problem_8.Solver.Node(12);
        root.left.left.right = new Problem_8.Solver.Node(7);
        root.left.left.right.left = new Problem_8.Solver.Node(19);
        root.left.left.right.right = new Problem_8.Solver.Node(25);
        root.right.left = new Problem_8.Solver.Node(5);
        root.right.right = new Problem_8.Solver.Node(6);
        root.right.right.left = new Problem_8.Solver.Node(13);
        return root;
    }
    static class Solver {
        static class Node {
            Node left;
            int data;
            Node right;
            public Node(int data){
                this.data = data;
            }
        }
        public void spiralOrder(Node root){
            if(root == null){
                return;
            }
            Deque<Node> deque = new ArrayDeque<>();
            deque.addFirst(root);
            boolean flag = false;
            while(!deque.isEmpty()){
                int size = deque.size();
                if(flag){
                    while(size --> 0){
                        Node curr = deque.pollFirst();
                        System.out.print(curr.data + " ");
                        if(curr.left != null){
                            deque.addLast(curr.left);
                        }
                        if(curr.right != null){
                            deque.addLast(curr.right);
                        }
                    }
                } else {
                    while(size --> 0){
                        Node curr = deque.pollLast();
                        System.out.print(curr.data + " ");
                        if(curr.right != null){
                            deque.addFirst(curr.right);
                        }
                        if(curr.left != null){
                            deque.addFirst(curr.left);
                        }
                    }
                }
                flag = !flag;
                System.out.println();
            }
        }
    }
}
