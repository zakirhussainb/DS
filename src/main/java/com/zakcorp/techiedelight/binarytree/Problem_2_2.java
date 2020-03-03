package com.zakcorp.techiedelight.binarytree;

import com.zakcorp.arrays.fivehundred.Problem_2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem_2_2 {
    /*
    Problem:- Calculate Count of Nodes in a Binary Tree
    Description:- The no. of nodes in a Binary tree is number of nodes on longest path from root node to leaf node.
    Procedure:-
        1. The idea is to traverse the tree in post-order fashion and calculate the count of nodes in left and right subtree.
     */
    public static void main(String[] args) {
        Problem_2_2.Solver.Recursive recursive = new Solver.Recursive();
        Problem_2_2.Solver.Iterative iterative = new Solver.Iterative();
        Problem_2_2.Solver.Node root = new Solver.Node(8);
        root.left = new Solver.Node(3);
        root.right = new Solver.Node(4);
        root.left.left = new Solver.Node(12);
        root.left.left.right = new Solver.Node(7);
        root.left.left.right.left = new Solver.Node(19);
        root.left.left.right.right = new Solver.Node(25);
        root.right.left = new Solver.Node(5);
        root.right.right = new Solver.Node(6);
        root.right.right.left = new Solver.Node(13);
        System.out.println("The no. of nodes in this Binary Tree are....." + recursive.count(root));
        System.out.println("The no. of nodes in this Binary Tree are....." + iterative.count(root));
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
            public int count(Node root){
                int x, y;
                if(root != null){
                    x = count(root.left);
                    y = count(root.right);
                    return x + y + 1;
                }
                return 0;
            }
        }
        static class Iterative {
            public int count(Node root){
                if(root == null){
                    return 0;
                }
                int counter = 0;
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
                        counter++;
                    }
                }
                return counter;
            }
        }
    }
}
