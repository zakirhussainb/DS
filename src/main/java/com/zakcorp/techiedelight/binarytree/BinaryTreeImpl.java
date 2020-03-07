package com.zakcorp.techiedelight.binarytree;

public class BinaryTreeImpl {
    static class Node {
        Node left;
        int data;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public void preorder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
