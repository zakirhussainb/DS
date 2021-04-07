package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_193_Test {
    P_193.Solver p = new P_193.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);

        root.left.left = new BinaryTree.Node(4);
        root.left.right = new BinaryTree.Node(5);
        root.right.left = new BinaryTree.Node(6);
        root.right.right = new BinaryTree.Node(7);

        root.right.left.right = new BinaryTree.Node(8);

        assertEquals(2, p.solve1(root, 4, 5) );
        assertEquals(4, p.solve1(root, 4, 6) );
        assertEquals(3, p.solve1(root, 3, 4) );
        assertEquals(1, p.solve1(root, 2, 4) );
        assertEquals(5, p.solve1(root, 8, 5) );

    }
}
