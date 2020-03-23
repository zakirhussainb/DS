package com.zakcorp.techiedelight.binarytree;

public class Problem_19 {
    /*
    Problem:- Check if a given BT is a sum tree or not.
    Description:- In a sum tree, value at each non-leaf node is equal to the sum of all elements present in its left
    and right subtree. The value of a leaf node can be anything.
    TODO:- Procedure:-
        1. This problem can be solved using recursion by traversing in post-order fashion.
     */
    public static void main(String[] args) {
        Problem_19 problem_18 = new Problem_19();
        BinaryTreeImpl.Node root = problem_18.dataGeneration();
        Problem_19.Solver solver = new Problem_19.Solver();
        if(solver.isSumTree(root) != Integer.MIN_VALUE){
            System.out.println("The given BT is a Sum tree....");
        } else {
            System.out.println("The given BT is NOT a sum tree....");
        }
    }
    public BinaryTreeImpl.Node dataGeneration() {
        BinaryTreeImpl.Node root = new BinaryTreeImpl.Node(44);

        root.left = new BinaryTreeImpl.Node(9);
        root.right = new BinaryTreeImpl.Node(13);

        root.left.left = new BinaryTreeImpl.Node(4);
        root.left.right = new BinaryTreeImpl.Node(5);

        root.right.left = new BinaryTreeImpl.Node(6);
        root.right.right = new BinaryTreeImpl.Node(7);
        return root;
    }
    static class Solver {
        public int isSumTree(BinaryTreeImpl.Node root){
            if(root == null){
                return 0;
            }
            // special case:- if the node is a leaf node
            if(root.left == null && root.right == null){
                return root.data;
            }
            // If root's value is equal to sum of all elements present in its left and right subtree.
            if(root.data == isSumTree(root.left) + isSumTree(root.right)){
                return 2 * root.data;
            }
            return Integer.MIN_VALUE;
        }
    }
}
