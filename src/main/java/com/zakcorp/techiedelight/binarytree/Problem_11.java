package com.zakcorp.techiedelight.binarytree;

import java.util.*;

public class Problem_11 {
    /*
    Problem:- Print left view of a binary tree.
    Description:- Given a binary tree, write an efficient algorithm to print the left view of a binary tree.
    We need to print nodes present at the first position on every level.
    TODO:- Procedure:-
        1. Similar to Level Order Traversal.
        2. Include a level-position-counter i.e. nodePosition to check if it is at 1st position, if yes then
        print it.
     */
    public static void main(String[] args) {
        Problem_11 problem_11 = new Problem_11();
        BinaryTreeImpl.Node root = problem_11.dataGeneration();
        Problem_11.Solver solver = new Problem_11.Solver();
//        solver.printLeftViewOofNAndOofN(root);
        solver.printLeftViewOofNAndOofNHashing(root);
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
        public void printLeftViewOofNAndOofN(BinaryTreeImpl.Node root) {
            if(root == null){
                return;
            }
            Queue<BinaryTreeImpl.Node> queue = new ArrayDeque<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                int i = 0;
                while(i++ < size){
                    BinaryTreeImpl.Node front = queue.poll();
                    if(i == 1){
                        System.out.print(front.data + " ");
                    }
                    if(front.left != null){
                        queue.add(front.left);
                    }
                    if(front.right != null){
                        queue.add(front.right);
                    }
                }
            }
        }
        public void printLeftViewOofNAndOofNHashing(BinaryTreeImpl.Node root){
            Map<Integer, Integer> map = new HashMap<>();
            leftView(map, 1, root);
            for(int i = 0; i <= map.size(); i++){
                System.out.print(map.get(i) + " ");
            }
        }
        public void leftView(Map<Integer, Integer> map, int level, BinaryTreeImpl.Node root){
            if(root == null){
                return;
            }
            map.put(level, root.data);
            leftView(map, level + 1, root.right);
            leftView(map, level + 1, root.left);
        }
    }
}
