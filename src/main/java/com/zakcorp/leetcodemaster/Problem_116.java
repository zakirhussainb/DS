package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.Node;

import java.util.*;

public class Problem_116 {
    static class Solver {
        public Node solve1(Node root) {
            if(root == null)
                return null;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    Node curr = queue.poll();
                    if(i < size - 1) {
                        curr.next = queue.peek();
                    }
                    if(curr.left != null)
                        queue.add(curr.left);
                    if(curr.right != null)
                        queue.add(curr.right);
                }
            }
            return root;
        }
    }
}
