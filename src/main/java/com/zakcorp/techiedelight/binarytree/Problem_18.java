package com.zakcorp.techiedelight.binarytree;

public class Problem_18 {
    /*
    Problem:- In place convert given BT to its sum tree.
    Description:- In a sum tree value at each node is equal to sum of all elements present in its left and right subtree.
    The value of the empty node is considered as 0.
    TODO:- Procedure:-
        1.
     */
    public static void main(String[] args) {
        Problem_18 problem_18 = new Problem_18();
        BinaryTreeImpl.Node root = problem_18.dataGeneration();
        Problem_18.Solver solver = new Problem_18.Solver();
        solver.inPlaceConvertToSumTree(root);
        BinaryTreeImpl bTImpl = new BinaryTreeImpl();
        bTImpl.preorder(root);
    }
    public BinaryTreeImpl.Node dataGeneration() {
        BinaryTreeImpl.Node root = new BinaryTreeImpl.Node(10);

        root.left = new BinaryTreeImpl.Node(-2);
        root.right = new BinaryTreeImpl.Node(6);

        root.left.left = new BinaryTreeImpl.Node(8);
        root.left.right = new BinaryTreeImpl.Node(-4);

        root.right.left = new BinaryTreeImpl.Node(7);
        root.right.right = new BinaryTreeImpl.Node(5);
        return root;
    }
    static class Solver {
        public int inPlaceConvertToSumTree(BinaryTreeImpl.Node root){
            if(root == null){
                return 0;
            }
            int x = inPlaceConvertToSumTree(root.left);
            int y = inPlaceConvertToSumTree(root.right);
            int old = root.data;
            root.data = x + y;
            return root.data + old;
        }
    }
}
