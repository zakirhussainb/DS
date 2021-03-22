package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class P_177_Test {
    P_177.Solver p = new P_177.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);

        root.left.left = new BinaryTree.Node(4);
        root.left.right = new BinaryTree.Node(5);

        root.left.left.left= new BinaryTree.Node(8);
        root.left.left.right = new BinaryTree.Node(9);

        root.left.left.right.left = new BinaryTree.Node(12);
        root.left.left.right.right = new BinaryTree.Node(13);

        root.left.right = new BinaryTree.Node(5);
        root.left.right.right = new BinaryTree.Node(10);

        root.right.left = new BinaryTree.Node(6);
        root.right.right = new BinaryTree.Node(7);

        root.right.right.left = new BinaryTree.Node(11);
        root.right.right.left.left = new BinaryTree.Node(14);
        assertEquals( Arrays.asList(1, 2, 4, 8, 12, 13, 10, 6, 14, 11, 7, 3), p.solve1(root) );
    }
}
