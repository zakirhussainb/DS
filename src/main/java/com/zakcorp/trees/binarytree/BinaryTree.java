package com.zakcorp.trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
    static class Node {
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data = data;
            left = null; right = null;
        }
    }

    public Node insert(Node p, int key){
        Queue<Node> queue = new LinkedList<>();
        queue.add(p);
        while(!queue.isEmpty()){
            p = queue.remove();
            if(p.left == null) {
                p.left = new Node(key);
                break;
            } else {
                queue.add(p.left);
            }
            if(p.right == null){
                p.right = new Node(key);
                break;
            } else {
                queue.add(p.right);
            }
        }
        return p;
    }
    public void inorderRec(Node p){
        if(p != null){
            inorderRec(p.left);
            System.out.print(p.data + " ");
            inorderRec(p.right);
        }
    }
    public Node delete(Node p, int key){
        // Find the rightmost node
        Node r = null;
        r = getRightMostNode(p);
        System.out.println("r...." + r.data);
        return r;
    }
    public Node getRightMostNode(Node p){
        while(p != null && p.right != null){
            p = p.right;
        }
        return p;
    }
}
