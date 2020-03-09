package com.zakcorp.techiedelight.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Problem_7 {
    /*
    Problem:- Level Order traversal of a Binary Tree
    Description:- Given a binary tree, write an efficient algorithm to traverse the tree level by level.
    TODO:- Procedure:-
     */
    public static void main(String[] args) {
        Problem_9 problem_9 = new Problem_9();
        BinaryTreeImpl.Node root = problem_9.dataGeneration();
        Problem_7.Solver.Solution1 problem = new Solver.Solution1();
        problem.levelOrder(root);
    }

    static class Solver {
        static class Solution1 {
            public void levelOrder(BinaryTreeImpl.Node root){
                if(root == null){
                    return;
                }
                Queue<BinaryTreeImpl.Node> queue = new ArrayDeque<>();
                queue.add(root);
                while(!queue.isEmpty()){
                    int size = queue.size();
                    while (size --> 0){
                        BinaryTreeImpl.Node front = queue.poll();
                        System.out.print(front.data + " ");
                        if(front.left != null){
                            queue.add(front.left);
                        }
                        if(front.right != null){
                            queue.add(front.right);
                        }
                    }
                }
            }
        }
    }
}
