package com.zakcorp.techiedelight.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem_3 {
    /*
    Problem:- Delete a Binary Tree
    Description:- Given a binary tree, write an efficient algorithm to delete entire binary tree.
    Procedure:-
        1. The idea is to traverse the tree in post-order fashion and delete left and right subtree of a node before deleting the entire
            node itself.
        2. Note that we cannot use pre-order or in-order as we cannot delete the parent before deleting its children.
     */
    public static void main(String[] args) {
        Problem_3.Solver.Recursive recursive = new Solver.Recursive();
        Problem_3.Solver.Iterative iterative = new Solver.Iterative();
        Solver.Node root = new Solver.Node(10);
        root.left = new Solver.Node(20);
        root.right = new Solver.Node(30);
        Solver.Node result = recursive.deleteBinaryTree(root);
        if(result == null){
            System.out.println("Binary Tree is deleted with recursive strategy....");
        } else {
            System.out.println("BT is working with recursive strategy....");
        }
        Solver.Node result1 = iterative.deleteBinaryTree(root);
        if(result1 == null){
            System.out.println("Binary Tree is deleted with iterative strategy....");
        } else {
            System.out.println("BT is working with iterative strategy....");
        }
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
            public Node deleteBinaryTree(Node root) {
                if(root != null){
                    deleteBinaryTree(root.left);
                    deleteBinaryTree(root.right);
                    root = null;
                    return root;
                }
                return null;
            }
        }
        static class Iterative {
            public Node deleteBinaryTree(Node root){
                Queue<Node> queue = new ArrayDeque<>();
                queue.add(root);
                while(!queue.isEmpty()){
                    Node front = queue.poll();
                    if(front != null){
                        if(front.left != null){
                            queue.add(front.left);
                        }
                        if(front.right != null){
                            queue.add(front.right);
                        }
                        front = null;
                        return front;
                    }
                }
                return null;
            }
        }
    }
}
