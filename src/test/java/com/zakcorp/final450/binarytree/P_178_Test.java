package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_178_Test {
    P_178.Solver p = new P_178.Solver();
    @Test
    public void test1() {
        BinaryTree bt = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node(4);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(6);

        root.left.left = new BinaryTree.Node(3);
        root.left.right = new BinaryTree.Node(1);

        root.right.left = new BinaryTree.Node(5);

        assertEquals( bt.levelOrder( root ), bt.levelOrder( p.solve1("4(2(3)(1))(6(5))") ) );
        assertEquals( bt.levelOrder( root ), bt.levelOrder( p.solve2("4(2(3)(1))(6(5))") ) );
    }
}
