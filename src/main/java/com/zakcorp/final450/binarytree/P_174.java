package com.zakcorp.final450.binarytree;


import com.zakcorp.trees.binarytree.BinaryTree;

import java.util.*;

public class P_174 {
    static class Solver {
        public List<Integer> solve1(BinaryTree.Node root) {
            List<Integer> list = new ArrayList<>();
            Deque<BinaryTree.Node> deque = new LinkedList<>();
            deque.addLast(root);
            boolean flag = false;
            while( !deque.isEmpty() ) {
                int size = deque.size();
                if(flag) {
                    while(size --> 0) {
                        BinaryTree.Node p = deque.pollFirst();
                        list.add(p.data);
                        if(p.left != null) {
                            deque.addLast(p.left);
                        }
                        if(p.right != null) {
                            deque.addLast(p.right);
                        }
                    }
                } else {
                    while(size --> 0) {
                        BinaryTree.Node p = deque.pollLast();
                        list.add(p.data);
                        if(p.left != null) {
                            deque.addFirst(p.left);
                        }
                        if(p.right != null) {
                            deque.addFirst(p.right);
                        }
                    }
                }
                flag = !flag;
            }
            return list;
        }
    }
}
