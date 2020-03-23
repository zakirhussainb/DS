package com.zakcorp.techiedelight.binarytree;

import java.util.*;

public class Problem_17 {
    /*
    Problem:- Print cousins of a given node in a Binary Tree.
    Description:- Two nodes are cousins in a BT, only if they are at same level but different parents.
    TODO:- Procedure:-
        1.
     */
    public static void main(String[] args) {
        BinaryTreeImpl btImpl = new BinaryTreeImpl();
        BinaryTreeImpl.Node root = btImpl.dataGeneration();
        Problem_17.Solver solver = new Problem_17.Solver();
        System.out.println(solver.getAllCousins(root));
    }

    static class Solver {
        static class Pair<U, V>{
            U first;
            V second;
            public Pair(U first, V second){
                this.first = first;
                this.second = second;
            }
            public static <U, V> Pair <U, V> of(U a, V b){
                return new Pair<>(a, b);
            }
        }
        public List<BinaryTreeImpl.Node> getAllCousins(BinaryTreeImpl.Node root){
            if(root == null){
                return null;
            }
            Map<BinaryTreeImpl.Node, Pair<BinaryTreeImpl.Node, Integer>> map = new HashMap<>();
            Queue<BinaryTreeImpl.Node> queue = new ArrayDeque<>();
            queue.add(root);
            int level = 1;
            BinaryTreeImpl.Node parent = null;
            while (!queue.isEmpty()){
                int size = queue.size();
                BinaryTreeImpl.Node front = null;
                while(size --> 0) {
                    front = queue.poll();
                    insertIntoMultiMap(front, parent, level, map);
                    if (front.left != null) {
                        queue.add(front.left);
                    }
                    if (front.right != null) {
                        queue.add(front.right);
                    }
                }
                parent = front;
                level++;
            }
            return null;
        }
        public void insertIntoMultiMap(BinaryTreeImpl.Node root, BinaryTreeImpl.Node parent, int level,
                                       Map<BinaryTreeImpl.Node, Pair<BinaryTreeImpl.Node, Integer>> map){
            if(!map.containsKey(root)){
                map.put(root, Pair.of(parent, level));
            }
        }
    }
}
