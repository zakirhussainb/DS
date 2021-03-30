package com.zakcorp.trees.binarytree;

import java.util.*;

public class BinaryTree {
    public static class Node {
        public Node left;
        public Node right;
        public int data;
        public Node(int data){
            this.data = data;
            left = null; right = null;
        }
        public boolean isLeaf() {
            return this.left == null && this.right == null;
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
    public Node getBinaryTree(String str) {
        String[] splitArr = str.split("\\s+");
        int n = splitArr.length;
        Node root = new Node(Integer.parseInt(splitArr[0]));
        for(int i = 1; i < n; i++) {
            insert(root, Integer.parseInt(splitArr[i]));
        }
        return root;
    }
    public Node buildTree(String str) {
        if( str.length() == 0 || str.charAt(0) == 'N' ) {
            return null;
        }
        String[] input = str.split("\\s+");
        Node root = new Node(Integer.parseInt(input[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        int n = input.length;
        while (queue.size() > 0 && i < n) {
            Node curr = queue.poll();
            String currVal = input[i];
            if(!currVal.equals("N")) {
                curr.left = new Node(Integer.parseInt(currVal));
                queue.add(curr.left);
            }
            i++;
            if(i >= n)
                break;
            currVal = input[i];
            if(!currVal.equals("N")) {
                curr.right = new Node(Integer.parseInt(currVal));
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    public List<Integer> levelOrder(Node p){
        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(p);
        while( !queue.isEmpty() ) {
            Node curr = queue.poll();
            result.add(curr.data);
            if(curr.left != null) {
                queue.add(curr.left);
            }
            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
        return result;
    }
}
