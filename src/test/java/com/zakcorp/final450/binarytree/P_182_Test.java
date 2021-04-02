package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_182_Test {
    P_182.Solver p = new P_182.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(8);
        root.left = new BinaryTree.Node(3);
        root.right = new BinaryTree.Node(5);
        root.left.left = new BinaryTree.Node(10);
        root.left.right = new BinaryTree.Node(2);
        root.right.left = new BinaryTree.Node(4);
        root.right.right = new BinaryTree.Node(6);

        assertEquals(4, p.solve1( root ) );
    }

    @Test
    public void test2() {
        BinaryTree.Node root = new BinaryTree.Node(4);
        root.left = new BinaryTree.Node(3);
        root.right = new BinaryTree.Node(2);
        root.left.left = new BinaryTree.Node(1);

        assertEquals(2, p.solve1( root ) );
    }
}
