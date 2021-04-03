package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class P_185_Test {
    P_185.Solver p = new P_185.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.left = new BinaryTree.Node(4);
        root.right.left = new BinaryTree.Node(2);
        root.right.left.left = new BinaryTree.Node(4);
        root.right.right = new BinaryTree.Node(4);

        assertTrue( p.solve1( root ));
    }
}
