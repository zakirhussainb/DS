package com.zakcorp.techiedelight.binarytree;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Problem_14 {
    /*
    Problem:- Find the Next Node in the same level for given node in a Binary Tree
    Description:- Given a binary tree and a node in it, write an efficient algorithm to find its next node
    in same level as given node.
    TODO:- Procedure:-
        1. Similar to Level Order Traversal
        2. Check if the given node is present in the queue, if yes then return queue.peek(),
        that will give you the next node.
     */
    public static void main(String[] args) {
        Problem_14 problem_14 = new Problem_14();
        BinaryTreeImpl.Node root = problem_14.dataGeneration();
        Problem_14.Solver solver = new Problem_14.Solver();
        BinaryTreeImpl.Node right = solver.printNextNodeForGivenNode(root, 3);
        if(right != null){
            System.out.println("Next node for given Node is..." + right.data);
        } else {
            System.out.println("No next node exists....");
        }
    }
    public BinaryTreeImpl.Node dataGeneration() {
        BinaryTreeImpl.Node root = new BinaryTreeImpl.Node(1);

        root.left = new BinaryTreeImpl.Node(2);
        root.right = new BinaryTreeImpl.Node(3);

        root.left.right = new BinaryTreeImpl.Node(4);

        root.right.left = new BinaryTreeImpl.Node(5);
        root.right.right = new BinaryTreeImpl.Node(6);

        root.right.left.left = new BinaryTreeImpl.Node(7);
        root.right.left.right = new BinaryTreeImpl.Node(8);
        return root;
    }
    static class Solver {
        public BinaryTreeImpl.Node printNextNodeForGivenNode(BinaryTreeImpl.Node root, int key){
            if(root == null){
                return null;
            }
            Queue<BinaryTreeImpl.Node> queue = new ArrayDeque<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                while(size --> 0){
                    BinaryTreeImpl.Node front = queue.poll();
                    // if desired node is found, return its next right node.
                    if(front.data == key){
                        // if next right node doesn't exists return null
                        if(size == 0){
                            return null;
                        }
                        return queue.peek();
                    }
                    if(front.left != null){
                        queue.add(front.left);
                    }
                    if(front.right != null){
                        queue.add(front.right);
                    }
                }
            }
            return null;
        }
    }
}
