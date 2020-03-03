package com.zakcorp.techiedelight.binarytree;

import com.zakcorp.arrays.fivehundred.Problem_2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Problem_2_1 {
    /*
    Problem:- Calculate Height of a Binary Tree
    Description:- The height or depth of a tree is number of edges or nodes on longest path from root node to leaf node.
    Procedure:-
        1. The idea is to traverse the tree in post-order fashion and calculate the height of left and right subtree.
        2. The height of the subtree rooted at any node will be equal to maximum height of its left and right subtree plus one.
        3. We then recursively apply this property to all tree nodes in bottom-up manner (post-order fashion)
            and return maximum height of the subtree rooted at that node.
     */
    public static void main(String[] args) {
        Problem_2_1.Solver.Recursive recursive = new Solver.Recursive();

        Problem_2_1.Solver.Node root = new Problem_2_1.Solver.Node(15);
        root.left = new Problem_2_1.Solver.Node(10);
        root.right = new Problem_2_1.Solver.Node(20);
        root.left.left = new Problem_2_1.Solver.Node(8);
        root.left.right = new Problem_2_1.Solver.Node(12);
        root.right.left = new Problem_2_1.Solver.Node(16);
        root.right.right = new Problem_2_1.Solver.Node(25);

        System.out.println("Height of the Tree via recursive strategy...." + recursive.getHeight(root));

        Problem_2_1.Solver.Iterative iterative = new Solver.Iterative();
        System.out.println("Height of the Tree via iterative strategy...." + iterative.getHeight(root));

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
            public int getHeight(Node root) {
                if(root != null){
                    return Math.max(getHeight(root.left), getHeight(root.right) + 1);
                }
                return 0;
            }
            /*If you find the above method confusing at the first place, then please take a look at the below method*/
            /*public int getHeightRec(Node root){
                int x, y;
                if(root != null){
                    x = getHeightRec(root.left);
                    y = getHeightRec(root.right);
                    if(x > y){
                        return x + 1;
                    } else {
                        return y + 1;
                    }
                }
                return 0;
            }*/
        }

        static class Iterative {
            public int getHeight(Node root){
                if(root == null){
                    return 0;
                }
                int height = 0;
                Queue<Node> queue = new ArrayDeque<>();
                queue.add(root);
                while(!queue.isEmpty()){
                    // Calculate the no. of nodes in current level
                    int size = queue.size();
                    // Traversing the tree for each and every level
                    while(size --> 0){
                        Node front = queue.poll();
                        if(front != null) {
                            if (front.left != null) {
                                queue.add(front.left);
                            }
                            if (front.right != null) {
                                queue.add(front.right);
                            }
                        }
                    }
                    // counting the height for each level by incrementing it to 1
                    height++;
                }
                return height;
            }
        }


    }
}


