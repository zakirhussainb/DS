package com.zakcorp.trees.bst;

public class DriverProgram {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.inorder();
        BinarySearchTree.Node p = bst.search(30);
        System.out.println(p.data);
        BinarySearchTree.Node p1 = bst.delete(80);
        bst.inorderRec(p1);
//        bst.delete(30);
//        bst.inorder();
//        bst.delete(50);
//        bst.inorder();
//        bst.delete(80);
//        bst.inorder();
    }
}
