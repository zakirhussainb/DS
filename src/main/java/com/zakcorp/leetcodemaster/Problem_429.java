package com.zakcorp.leetcodemaster;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

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
            List<List<Integer>> resultList = new ArrayList<>();
            Queue<Node> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()){
                int size = queue.size();
                while(size --> 0){
                    Node curr = queue.poll();
                    List<Integer> list = new ArrayList<>();
                    list.add(curr.val);
                    if(curr.children != null){
                        queue.addAll(curr.children);
                    }
                    resultList.add(list);
                }
            }
            return resultList;
        }
    }
}
