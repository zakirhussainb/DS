package com.zakcorp.techiedelight.binarytree;

import java.util.*;

public class Problem_8 {
    /*
    Problem:- Spiral Order traversal of a Binary Tree
    Description:- Given a binary tree, write an efficient algorithm to traverse the tree in a spiral order fashion.
    Idea:- The idea is to use a Deque, and utilize a flag to toggle between spiral orders.
    TODO:- Procedure:-
        1. Add root to the first position of a Deque.
        2. Initialize a boolean flag = false.
        3. While the Deque is not Empty, perform traversal.
            3.1 Calculate deque size -> size = deque.size();
            3.2 Check if flag is true.
                3.2.1
            3.3 Else flag is false
            3.4 Flip the flag -> flag != flag
     */
    public static void main(String[] args) {
        BinaryTreeImpl btImpl = new BinaryTreeImpl();
        BinaryTreeImpl.Node root = btImpl.dataGeneration();
        Problem_8.Solver solver = new Problem_8.Solver();
//        solver.spiralOrder(root);
        solver.spiralOrderUsingHashing(root);
    }
    static class Solver {
        public void spiralOrder(BinaryTreeImpl.Node root){
            if(root == null){
                return;
            }
            Deque<BinaryTreeImpl.Node> deque = new ArrayDeque<>();
            deque.addFirst(root);
            boolean flag = false;
            while(!deque.isEmpty()){
                int size = deque.size();
                if(flag){
                    while(size --> 0){
                        BinaryTreeImpl.Node curr = deque.pollFirst();
                        System.out.print(curr.data + " ");
                        if(curr.left != null){
                            deque.addLast(curr.left);
                        }
                        if(curr.right != null){
                            deque.addLast(curr.right);
                        }
                    }
                } else {
                    while(size --> 0){
                        BinaryTreeImpl.Node curr = deque.pollLast();
                        System.out.print(curr.data + " ");
                        if(curr.right != null){
                            deque.addFirst(curr.right);
                        }
                        if(curr.left != null){
                            deque.addFirst(curr.left);
                        }
                    }
                }
                flag = !flag;
                System.out.println();
            }
        }
        public void spiralOrderUsingHashing(BinaryTreeImpl.Node root){
            Map<Integer, Deque<Integer>> map = new HashMap<>();
            int level = 1;
            preOrderSpiral(root, level, map);
            for(int i = 1; i <= map.size(); i++){
                System.out.print(map.get(i) + " ");
            }
        }
        public void preOrderSpiral(BinaryTreeImpl.Node root, int level, Map<Integer, Deque<Integer>> map){
            if(root == null){
                return;
            }
            if(!map.containsKey(level)){
                map.put(level, new ArrayDeque<>());
            }
            if(level % 2 == 0){
                map.get(level).addLast(root.data);
            } else {
                map.get(level).addFirst(root.data);
            }
            preOrderSpiral(root.left, level + 1, map);
            preOrderSpiral(root.right, level + 1, map);
        }
    }
}
