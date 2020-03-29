package com.zakcorp.techiedelight.binarytree;

import java.util.*;

public class Problem_21 {
    /*
    Problem:- Determine if given BT is a subtree of another BT or not.
    Description:- A subtree of a tree T is a tree consisting of a node in T and all of its descendants in T.
    TODO:- Procedure:-
        1.
     */
    public static void main(String[] args) {
        BinaryTreeImpl.Node subtree = new BinaryTreeImpl.Node(3);
        subtree.left = new BinaryTreeImpl.Node(6);
        subtree.right = new BinaryTreeImpl.Node(17);
        Problem_21 problem_21 = new Problem_21();
        BinaryTreeImpl.Node root = problem_21.dataGeneration();
        Problem_21.Solver solver = new Problem_21.Solver();
        if(solver.isSubTree(root, subtree)){
            System.out.println("YES - The given BT is a subtree of this BT....");
        } else {
            System.out.println("NO - The given BT is NOT a subtree of this BT....");
        }
    }
    public BinaryTreeImpl.Node dataGeneration() {
        BinaryTreeImpl.Node root = new BinaryTreeImpl.Node(1);

        root.left = new BinaryTreeImpl.Node(2);
        root.right = new BinaryTreeImpl.Node(3);

        root.left.left = new BinaryTreeImpl.Node(4);
        root.left.right = new BinaryTreeImpl.Node(5);

        root.right.left = new BinaryTreeImpl.Node(6);
        root.right.right = new BinaryTreeImpl.Node(7);
        return root;
    }
    static class Solver {
        private void inorder(BinaryTreeImpl.Node root, List<BinaryTreeImpl.Node> list){
            if(root != null){
                inorder(root.left, list);
                list.add(root);
                inorder(root.right, list);
            }
        }
        private void postorder(BinaryTreeImpl.Node root, List<BinaryTreeImpl.Node> list){
            if(root != null){
                postorder(root.left, list);
                postorder(root.right, list);
                list.add(root);
            }
        }
        public boolean isSubTree(BinaryTreeImpl.Node tree, BinaryTreeImpl.Node subtree){
            if(tree == subtree)
                return true;
            if(tree == null)
                return false;
            List<BinaryTreeImpl.Node> first = new ArrayList<>();
            List<BinaryTreeImpl.Node> second = new ArrayList<>();
            inorder(tree, first);
            inorder(subtree, second);
//            System.out.println(first.toString());
//            System.out.println(second.toString());
            if(first.toString().contains(second.toString())){
                return false;
            }
            first.clear();
            second.clear();
            postorder(tree, first);
            postorder(subtree, second);
            if(first.toString().contains(second.toString())){
                return false;
            }
            return true;
        }
    }
}
