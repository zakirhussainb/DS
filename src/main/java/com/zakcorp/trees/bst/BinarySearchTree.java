package com.zakcorp.trees.bst;

import java.util.Stack;

public class BinarySearchTree {
    public TreeNode root;
    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int data){
            this.data = data;
            left = null; right = null;
        }
        public TreeNode(){

        }
    }
    public BinarySearchTree(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }
    public TreeNode insertRec(TreeNode root, int key) {
        if(root == null){
            root = new TreeNode(key);
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

    public void inorderRec(TreeNode root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + "->");
            inorderRec(root.right);
        }
    }

    public TreeNode search(int key) {
        return searchRec(root, key);
    }

    public TreeNode searchRec(TreeNode root, int key){
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
    public TreeNode delete(int key) {
        return deleteRec(root, key);
    }
    public TreeNode deleteRec(TreeNode p, int key) {
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
            TreeNode q;
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
    public int getHeight(TreeNode root) {
        int x,y;
        if(root == null)
            return 0;
        x = getHeight(root.left);
        y = getHeight(root.right);
        return x > y ? x+1 : y+1;
    }
    public TreeNode getInorderPre(TreeNode p){
        while(p != null && p.right != null) {
            p = p.right;
        }
        return p;
    }
    public TreeNode getInorderSucc(TreeNode p){
        while(p != null && p.left != null){
            p = p.left;
        }
        return p;
    }

    public void insertIterative(TreeNode root, int key) {
        if(root == null) {
            root = new TreeNode(key);
            return;
        }
        TreeNode r = null;
        TreeNode p = root;
        while(p != null) {
            r = p;
            if(key < p.data) {
                p = p.left;
            } else if(key > p.data) {
                p = p.right;
            } else {
                break;
            }
        }
        p = new TreeNode(key);
        if(key < r.data) {
            r.left = p;
        } else {
            r.right = p;
        }
    }

    public void inorderIterative(TreeNode root) {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while( !stack.isEmpty() || curr != null ) {
            if(curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                System.out.print(curr.data + "->");
                curr = curr.right;
            }
        }

    }
}
