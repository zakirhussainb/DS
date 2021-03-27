package com.zakcorp.trees.bst;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {

    @Test
    public void test1() {
        BinarySearchTree bst = new BinarySearchTree();
        BinarySearchTree.TreeNode root = new BinarySearchTree.TreeNode(9);
        bst.insertIterative(root, 15);
        bst.insertIterative(root, 5);
        bst.insertIterative(root, 20);
        bst.insertIterative(root, 16);
        bst.insertIterative(root, 8);
        bst.insertIterative(root, 12);
        bst.insertIterative(root, 3);
        bst.insertIterative(root, 6);

        bst.inorderRec(root);
        System.out.println();
        bst.inorderIterative(root);
    }
}
