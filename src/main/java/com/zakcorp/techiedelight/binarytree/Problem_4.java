package com.zakcorp.techiedelight.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Problem_4 {
    /*
    Problem:- Inorder traversal of a Binary Tree
    Description:- Given a binary tree, write an efficient algorithm to traverse the tree using in-order.
    Procedure:-
        1. Recursively traverse the left sub tree. When this step is finished we are back at N again.
        2. Process N itself.
        3. Recursively traverse the right sub tree. When this step is finished we are back at N again.
     */
    public static void main(String[] args) {
        Problem_4 problem_4 = new Problem_4();
        Problem_4.Solver.Recursive recursive = new Solver.Recursive();
        Problem_4.Solver.Iterative iterative = new Solver.Iterative();
        Solver.Node root = problem_4.dataGeneration();
        recursive.inorder(root);
        System.out.println();
        iterative.inorder(root);
    }
    public Problem_4.Solver.Node dataGeneration() {
        Problem_4.Solver.Node root = new Problem_4.Solver.Node(8);
        root.left = new Problem_4.Solver.Node(3);
        root.right = new Problem_4.Solver.Node(4);
        root.left.left = new Problem_4.Solver.Node(12);
        root.left.left.right = new Problem_4.Solver.Node(7);
        root.left.left.right.left = new Problem_4.Solver.Node(19);
        root.left.left.right.right = new Problem_4.Solver.Node(25);
        root.right.left = new Problem_4.Solver.Node(5);
        root.right.right = new Problem_4.Solver.Node(6);
        root.right.right.left = new Problem_4.Solver.Node(13);
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
            public void inorder(Node root) {
                if(root != null){
                    inorder(root.left);
                    System.out.print(root.data + " ");
                    inorder(root.right);
                }
            }
        }
        static class Iterative {
            public void inorder(Node root){
                if(root == null){
                    return;
                }
                Stack<Node> stack = new Stack<>();
                Node curr = root;
                while(!stack.isEmpty() || curr != null){
                    if(curr != null){
                        stack.push(curr);
                        curr = curr.left;
                    } else {
                        curr = stack.pop();
                        System.out.print(curr.data + " ");
                        curr = curr.right;
                    }
                }

            }
        }
    }
}
