package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_187_Test {
    P_187.Solver p = new P_187.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(4);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(5);
        root.left.left = new BinaryTree.Node(8);
        root.left.right = new BinaryTree.Node(1);
        root.right.left = new BinaryTree.Node(2);
        root.right.right = new BinaryTree.Node(3);
        root.left.right.left = new BinaryTree.Node(6);

        assertEquals( 13, p.solve1( root ) );
    }
}
