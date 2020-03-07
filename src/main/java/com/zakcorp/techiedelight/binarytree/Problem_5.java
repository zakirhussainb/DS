package com.zakcorp.techiedelight.binarytree;

import java.util.Stack;

public class Problem_5 {
    /*
    Problem:- Preorder traversal of a Binary Tree
    Description:- Given a binary tree, write an efficient algorithm to traverse the tree using pre-order.
    Procedure:-
        1. Process N itself.
        2. Recursively traverse the left sub tree. When this step is finished we are back at N again.
        3. Recursively traverse the right sub tree. When this step is finished we are back at N again.
     */
    public static void main(String[] args) {
        Problem_5 problem_4 = new Problem_5();
        Problem_5.Solver.Recursive recursive = new Solver.Recursive();
        Problem_5.Solver.Iterative iterative = new Solver.Iterative();
        Problem_5.Solver.Iterative2 iterative2 = new Solver.Iterative2();
        Solver.Node root = problem_4.dataGeneration();
        recursive.preorder(root);
        System.out.println();
        iterative.preorder(root);
        System.out.println();
        iterative2.preorder(root);
    }
    public Problem_5.Solver.Node dataGeneration() {
        Problem_5.Solver.Node root = new Problem_5.Solver.Node(8);
        root.left = new Problem_5.Solver.Node(3);
        root.right = new Problem_5.Solver.Node(4);
        root.left.left = new Problem_5.Solver.Node(12);
        root.left.left.right = new Problem_5.Solver.Node(7);
        root.left.left.right.left = new Problem_5.Solver.Node(19);
        root.left.left.right.right = new Problem_5.Solver.Node(25);
        root.right.left = new Problem_5.Solver.Node(5);
        root.right.right = new Problem_5.Solver.Node(6);
        root.right.right.left = new Problem_5.Solver.Node(13);
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
        static class Recursive {
            public void preorder(Node root) {
                if(root != null){
                    System.out.print(root.data + " ");
                    preorder(root.left);
                    preorder(root.right);
                }
            }
        }
        static class Iterative {
            public void preorder(Node root){
                if(root == null){
                    return;
                }
                Stack<Node> stack = new Stack<>();
                stack.push(root);
                while (!stack.isEmpty()){
                    Node temp = stack.pop();
                    System.out.print(temp.data + " ");
                    if(temp.right != null){
                        stack.push(temp.right);
                    }
                    if(temp.left != null){
                        stack.push(temp.left);
                    }
                }
            }
        }
        static class Iterative2 {
            public void preorder(Node root){
                if(root == null){
                    return;
                }
                Stack<Node> stack = new Stack<>();
                stack.push(root);
                Node curr = root;
                while(!stack.isEmpty()){
                    if(curr != null){
                        System.out.print(curr.data + " ");
                        if(curr.right != null){
                            stack.push(curr.right);
                        }
                        curr = curr.left;
                    } else {
                        curr = stack.pop();
                    }
                }
            }
        }
    }
}
