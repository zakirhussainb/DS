package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_559 {
    static class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    static class Solver {
        public int maxDepth(Node root) {
            int maxDepth = 0;
            if(root == null) {
                return maxDepth;
            }
            Queue<Node> queue = new ArrayDeque<>();
            queue.add(root);
            int level = 1;
            while( !queue.isEmpty() ) {
                int size = queue.size();
                while(size --> 0) {
                    Node curr = queue.poll();
                    maxDepth = Math.max(maxDepth, level);
                    queue.addAll(curr.children);
                }
                level++;
            }
            return maxDepth;
        }
    }
}
