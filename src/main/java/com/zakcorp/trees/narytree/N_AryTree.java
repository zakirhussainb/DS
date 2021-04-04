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

    public void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while( !queue.isEmpty() ) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");
            if(curr.children != null) {
                queue.addAll(curr.children);
            }
        }
        System.out.println();
    }
}
