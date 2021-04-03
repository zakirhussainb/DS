package com.zakcorp.trees.narytree;

import java.util.*;

public class N_AryTree {
    Node root;
    public static class Node {
        public int data;
        public List<Node> children;
        public Node(int data) {
            this.data = data;
        }
        public Node(int data, List<Node> children) {
            this.data = data;
            this.children = children;
        }
    }
    public Node buildNAryTree(Map<Integer, List<Integer>> inputMap) {
        for(Map.Entry<Integer, List<Integer>> entry : inputMap.entrySet()) {
            if(root == null) {
                root = new Node( entry.getKey(), new ArrayList<>() );
                for(int m : entry.getValue()) {
                    root.children.add( new Node( m ) );
                }
            } else {
                for(Node n : root.children) {
                    if(n.data == entry.getKey()) {
                        n = new Node( entry.getKey(), new ArrayList<>() );
                        for(int m : entry.getValue()) {
                            n.children.add( new Node( m ) );
                        }
                    }
                }
            }

        }
        return root;
    }
    public void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while( !queue.isEmpty() ) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");
            queue.addAll(curr.children);
        }
    }
}
