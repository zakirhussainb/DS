package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_590 {
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
        public List<Integer> postOrderRecursive(Node root, List<Integer> list) {
            if(root == null){
                return list;
            }
            if(root.children != null){
                for(Node child : root.children) {
                    postOrderRecursive(child, list);
                }
            }
            list.add(root.val);
            return list;
        }
        public LinkedList<Integer> postOrderIterative(Node root, LinkedList<Integer> list) {
            if(root == null){
                return list;
            }
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node curr = stack.pop();
                if(curr.children != null) {
                    for(Node child : curr.children) {
                        stack.push(child);
                    }
                }
                list.addFirst(curr.val);
            }
            return list;
        }
    }
}
