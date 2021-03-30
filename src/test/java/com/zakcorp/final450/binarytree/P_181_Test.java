package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_181_Test {
    P_181.Solver p = new P_181.Solver();
    @Test
    public void test1() {
        BinaryTree bt = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);

        root.left.left = new BinaryTree.Node(4);

        root.right.left = new BinaryTree.Node(5);
        root.right.right = new BinaryTree.Node(6);

        root.right.left.left = new BinaryTree.Node(7);
        root.right.left.right = new BinaryTree.Node(8);

        assertEquals( bt.levelOrder( root ), bt.levelOrder( p.solve1(new int[] {4, 2, 1, 7, 5, 8, 3, 6}, new int[] {1, 2, 4, 3, 5, 7, 8, 6}) ));
    }
}
