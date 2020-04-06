package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * 589. N-ary Tree PreOrder Traversal
 * Remember we cannot use Queue for PreOrder traversal
 * We can either use Stack or Deque.
 */
public class Problem_589 {
    static class Node {
        public int val;
        public List<Node> children;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
    static class Solver {
        public List<Integer> recursive(Node root, List<Integer> list) {
            if(root == null){
                return list;
            }
            list.add(root.val);
            if(root.children != null){
                for(Node child : root.children) {
                    recursive(child, list);
                }
            }
            return list;
        }
        public List<Integer> iterative(Node root, List<Integer> list) {
            if(root == null) {
                return list;
            }
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty()) {
                Node curr = stack.pop();
                list.add(curr.val);
                if(curr.children != null) {
                    for(int i = curr.children.size() - 1; i >= 0; i--) {
                        stack.push(curr.children.get(i));
                    }
                }
            }
            return list;
        }
    }
}
