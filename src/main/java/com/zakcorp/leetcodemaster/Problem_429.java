package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_429 {
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
        public List<List<Integer>> levelOrder(Node root){
            List<List<Integer>> resultList = new LinkedList<>();
            if(root == null){
                return resultList;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                int size = queue.size();
                List<Integer> list = new LinkedList<>();
                while(size --> 0){
                    Node curr = queue.poll();
                    list.add(curr.val);
                    if(curr.children != null){
                        queue.addAll(curr.children);
                    }
                }
                resultList.add(list);
            }
            return resultList;
        }
    }
}
