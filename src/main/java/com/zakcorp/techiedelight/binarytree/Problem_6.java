package com.zakcorp.techiedelight.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Problem_6 {
    /*
    Problem:- Post Order traversal of a Binary Tree
    Description:- Given a binary tree, write an efficient algorithm to traverse the tree using Post order traversal.
    TODO:- Procedure:-
     */
    public static void main(String[] args) {
        Problem_9 problem_9 = new Problem_9();
        BinaryTreeImpl.Node root = problem_9.dataGeneration();
        Problem_6.Solver.Recursive recursive = new Solver.Recursive();
        recursive.postOrder(root);
        System.out.println("Recursive implementation.....");
        Problem_6.Solver.Iterative iterative = new Solver.Iterative();
        iterative.postOrder(root);
        System.out.println("Iterative implementation.....");
    }

    static class Solver {
        static class Recursive {
            public void postOrder(BinaryTreeImpl.Node root){
                if(root != null){
                    postOrder(root.left);
                    postOrder(root.right);
                    System.out.print(root.data + " ");
                }
            }
        }
        static class Iterative {
            public void postOrder(BinaryTreeImpl.Node root) {
                if(root == null){
                    return;
                }
                Stack<BinaryTreeImpl.Node> stack = new Stack<>();
                stack.push(root);
                Stack<Integer> out = new Stack<>();
                while(!stack.isEmpty()){
                    BinaryTreeImpl.Node curr = stack.pop();
                    out.push(curr.data);
                    if(curr.left != null){
                        stack.push(curr.left);
                    }
                    if(curr.right != null){
                        stack.push(curr.right);
                    }
                }
                while(!out.isEmpty()){
                    System.out.print(out.pop() + " ");
                }
            }
        }
    }
}
