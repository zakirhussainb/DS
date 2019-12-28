package com.zakcorp.trees.binarytree;

public class DriverProgram {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node(5);
        bt.insert(root, 10);
        bt.insert(root, 20);
        bt.insert(root, 30);
        bt.insert(root, 40);
        bt.insert(root, 50);
        bt.insert(root, 60);
        bt.inorderRec(root);
        bt.delete(root, 20);
    }
}
