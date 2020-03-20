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
    public BinaryTreeImpl.Node dataGeneration() {
        BinaryTreeImpl.Node root = new BinaryTreeImpl.Node(1);

        root.left = new BinaryTreeImpl.Node(2);
        root.right = new BinaryTreeImpl.Node(3);

        root.left.left = new BinaryTreeImpl.Node(4);
        root.left.right = new BinaryTreeImpl.Node(5);

        root.right.left = new BinaryTreeImpl.Node(6);
        root.right.right = new BinaryTreeImpl.Node(7);
        return root;
    }
}
