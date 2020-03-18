package com.zakcorp.techiedelight.binarytree;

import java.util.Map;
import java.util.TreeMap;

public class Problem_13 {
    /*
    Problem:- Print Top view of a binary tree.
    Description:- Given a binary tree, print top view of it. Assume the left and right child of a node
    makes 45 degree angle with parent.
    TODO:- Procedure:-
        1. Maintain a TreeMap for {Key - Horizontal Distance, Value - Pair<Level, Root.Data>}
        2. Perform Pre-order Traversal
        3. Insert into the map by checking for distance and whether current level is lesser than existing level in the
        map.
     */
    public static void main(String[] args) {
        Problem_13 problem_13 = new Problem_13();
        BinaryTreeImpl.Node root = problem_13.dataGeneration();
        Problem_13.Solver solver = new Problem_13.Solver();
//        solver.printLeftViewOofNAndOofN(root);
        solver.printTopView(root);
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
        public void printTopView(BinaryTreeImpl.Node root) {
            Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
            printTopView(root, 0, 1, map);
            for(Pair<Integer, Integer> pair : map.values()){
                System.out.print(pair.second + " ");
            }
        }
        private void printTopView(BinaryTreeImpl.Node root, int dist, int level,
                                     Map<Integer, Pair<Integer, Integer>> map){
            if(root == null){
                return;
            }
            if(!map.containsKey(dist) || level < map.get(dist).first){
               map.put(dist, Pair.of(level, root.data));
            }
            printTopView(root.left, dist - 1, level + 1, map);
            printTopView(root.right, dist + 1, level + 1, map);
        }
    }
}
