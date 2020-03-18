package com.zakcorp.techiedelight.binarytree;

import java.util.*;

public class Problem_12 {
    /*
    Problem:- Print Bottom view of a binary tree.
    Description:- Given a binary tree, print bottom view of it. Assume the left and right child of a node
    makes 45 degree angle with parent.
    TODO:- Procedure:-
        1. Maintain a TreeMap for {Key - Horizontal Distance, Value - Pair<Level, Root.Data>}
        2. Perform Pre-order Traversal
        3. Insert into map by checking for distance and level.
     */
    public static void main(String[] args) {
        Problem_12 problem_12 = new Problem_12();
        BinaryTreeImpl.Node root = problem_12.dataGeneration();
        Problem_12.Solver solver = new Problem_12.Solver();
//        solver.printLeftViewOofNAndOofN(root);
        solver.printBottomView(root);
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
        static class Pair<U, V> {
            public final U first;
            public final V second;
            public Pair(U first, V second){
                this.first = first;
                this.second = second;
            }
            // Factory method for creating a Typed Pair immutable instance
            public static <U, V> Pair <U, V> of(U a, V b){
                // calls private constructor
                return new Pair<>(a, b);
            }
        }
        // This is an O(n (log n)) solution as you are using a TreeMap, which internally sorts based on key
        public void printBottomView(BinaryTreeImpl.Node root) {
            Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
            printBottomView(root, 0, 1, map);
            for(Pair<Integer, Integer> pair : map.values()){
                System.out.print(pair.second + " ");
            }
        }
        private void printBottomView(BinaryTreeImpl.Node root, int dist, int level,
                                     Map<Integer, Pair<Integer, Integer>> map){
            if(root == null){
                return;
            }
            if(!map.containsKey(dist) || level >= map.get(dist).first){
               map.put(dist, Pair.of(level, root.data));
            }
            printBottomView(root.left, dist - 1, level + 1, map);
            printBottomView(root.right, dist + 1, level + 1, map);
        }
    }
}
