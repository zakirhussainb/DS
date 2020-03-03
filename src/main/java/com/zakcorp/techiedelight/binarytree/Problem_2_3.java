package com.zakcorp.techiedelight.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem_2_3 {
    /*
    Problem:- Calculate Sum of all the Nodes in a Binary Tree
    Procedure:-
        1. The idea is to traverse the tree in post-order fashion and calculate the sum of nodes in left and right subtree.
     */
    public static void main(String[] args) {
        Problem_2_3.Solver.Recursive recursive = new Solver.Recursive();
        Problem_2_3.Solver.Iterative iterative = new Solver.Iterative();
        Problem_2_3.Solver.Node root = new Solver.Node(8);
        root.left = new Solver.Node(3);
        root.right = new Solver.Node(4);
        root.left.left = new Solver.Node(12);
        root.left.left.right = new Solver.Node(7);
        root.left.left.right.left = new Solver.Node(19);
        root.left.left.right.right = new Solver.Node(25);
        root.right.left = new Solver.Node(5);
        root.right.right = new Solver.Node(6);
        root.right.right.left = new Solver.Node(13);
//        System.out.println("The sum of nodes in this Binary Tree using recursive strategy are....." + recursive.sum(root));
        System.out.println("The sum of nodes in this Binary Tree using iterative strategy are....." + iterative.sum(root));
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
            public int sum(Node root){
                int x, y;
                if(root != null){
                    x = sum(root.left);
                    y = sum(root.right);
                    return x + y + root.data;
                }
                return 0;
            }
        }
        static class Iterative {
            public int sum(Node root){
                if(root == null){
                    return 0;
                }
                int sum = 0;
                Queue<Node> queue = new ArrayDeque<>();
                queue.add(root);
                while (!queue.isEmpty()){
                    Node front = queue.poll();
                    if(front != null){
                        if(front.left != null){
                            queue.add(front.left);
                        }
                        if(front.right != null){
                            queue.add(front.right);
                        }
                        sum = sum + front.data;
                    }
                }
                return sum;
            }
        }
    }
}
