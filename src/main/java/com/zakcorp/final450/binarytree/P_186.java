package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.narytree.N_AryTree;

import java.util.*;

public class P_186 {
    /* Check if two trees are mirror or not - for an n-ary tree
      We cannot do it like we do for Binary Tree */
    static class Solver {
        public boolean solve1(N_AryTree.Node t1, N_AryTree.Node t2) {
            Stack<Integer> stack = new Stack<>();
            pushToStack(t1, stack);
            Queue<Integer> queue = new LinkedList<>();
            pushToQueue(t2, queue);

            while( !stack.isEmpty() && !queue.isEmpty() ) {
                if( !stack.pop().equals( queue.poll() ) ) {
                    return false;
                }
            }
            return true;
        }
        private void pushToStack(N_AryTree.Node root, Stack<Integer> stack) {
            if(root == null)
                return;
            stack.push(root.data);
            for(int i = 0; i < root.children.size(); i++) {
                pushToStack(root.children.get(i), stack);
            }
        }
        private void pushToQueue(N_AryTree.Node root, Queue<Integer> queue) {
            if(root == null)
                return;
            for(int i = 0; i < root.children.size(); i++) {
                pushToQueue(root.children.get(i), queue);
            }
            queue.add(root.data);
        }
    }
}
