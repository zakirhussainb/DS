package com.zakcorp.trees.bst;

public class BST_Practice {
    Node root;
    public class Node {
        Node left;
        Node right;
        int data;
        public Node(int data) {
            this.data = data;
        }
    }
    public BST_Practice() {
        root = null;
    }
    public void insert(int key) {
        root = insertRecursive(root, key);
    }
    public void insertIterative(int key) {
        if(root == null) {
            root = new Node(key);
            return;
        }
        Node p = root; Node r = root;
        while(p != null) {
            r = p;
            if(p.data == key) {
                return;
            } else if(p.data < key) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        Node m = new Node(key);
        if(r.data < m.data) {
            r.right = m;
        } else {
            r.left = m;
        }
    }
    public Node insertRecursive(Node root, int key) {
        if(root == null) {
            root = new Node(key);
            return root;
        }
        if(root.data == key) {
           return root;
        } else if (root.data < key) {
            root.right = insertRecursive(root.right, key);
        } else {
            root.left = insertRecursive(root.left, key);
        }
        return root;
    }
    public void inorder() {
        inorderRecursive(this.root);
    }
    public void inorderRecursive(Node root) {
        if(root == null) {
            return;
        }
        inorderRecursive(root.left);
        System.out.print(root.data + "=>");
        inorderRecursive(root.right);
    }
}
