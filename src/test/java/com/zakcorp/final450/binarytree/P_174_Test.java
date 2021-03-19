package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

public class P_174_Test {
    P_174.Solver p = new P_174.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(10);
        root.left = new BinaryTree.Node(20);
        root.right = new BinaryTree.Node(30);
        root.left.left = new BinaryTree.Node(40);
        root.left.right = new BinaryTree.Node(50);
        root.right.left = new BinaryTree.Node(60);
        root.left.right.left = new BinaryTree.Node(100);
        root.left.right.left.left = new BinaryTree.Node(110);
        root.right.left.right = new BinaryTree.Node(70);
        root.right.left.right.left = new BinaryTree.Node(80);
        root.right.left.right.right = new BinaryTree.Node(90);
        System.out.println( p.solve1(root) );
    }
}
