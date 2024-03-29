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
    static class Solver1 {
        int maxDepth = 0;
        public int maxDepth(Node root) {
            if(root == null) {
                return maxDepth;
            }
            dfs(root, 1);
            return maxDepth;
        }
        private void dfs(Node root, int level) {
            maxDepth = Math.max(maxDepth, level);
            for(Node p : root.children) {
                dfs(p, level + 1);
            }
        }
    }
}
