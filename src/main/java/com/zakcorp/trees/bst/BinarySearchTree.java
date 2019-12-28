package com.zakcorp.trees.bst;

import java.util.Map;

public class BinarySearchTree {
    Node root;
    class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null; right = null;
        }
    }
    public BinarySearchTree(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }
    public Node insertRec(Node root, int key) {
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.data){
            root.left = insertRec(root.left, key);
        } else if(key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
        System.out.println();
    }

    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public Node search(int key) {
        return searchRec(root, key);
    }

    public Node searchRec(Node root, int key){
        if(root == null){
            return null;
        }
        if(key == root.data){
            return root;
        } else if(key < root.data){
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }
    public Node delete(int key) {
        return deleteRec(root, key);
    }
    public Node deleteRec(Node p, int key) {
        if(p == null)
            return null;
        if(p.left == null && p.right == null){
            if(p == root)
                root = null;
            return null;
        }
        if(key < p.data){
            p.left = deleteRec(p.left, key);
        } else if(key > p.data){
            p.right = deleteRec(p.right, key);
        } else {
            Node q;
            if(getHeight(p.left) > getHeight(p.right)){
               q = getInorderPre(p.left);
               p.data = q.data;
               p.left = deleteRec(p.left, q.data);
            } else {
                q = getInorderSucc(p.right);
                p.data = q.data;
                p.right = deleteRec(p.right, q.data);
            }
        }
        return p;
    }
    public int getHeight(Node root) {
        int x,y;
        if(root == null)
            return 0;
        x = getHeight(root.left);
        y = getHeight(root.right);
        return x > y ? x+1 : y+1;
    }
    public Node getInorderPre(Node p){
        while(p != null && p.right != null) {
            p = p.right;
        }
        return p;
    }
    public Node getInorderSucc(Node p){
        while(p != null && p.left != null){
            p = p.left;
        }
        return p;
    }
}
