package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class P_175_Test {
    P_175.Solver p = new P_175.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.right = new BinaryTree.Node(4);
        root.right.left = new BinaryTree.Node(5);
        root.right.right = new BinaryTree.Node(6);
        root.right.left.left = new BinaryTree.Node(7);
        root.right.left.right = new BinaryTree.Node(8);
        assertTrue( p.solve1(root) );
    }
}
