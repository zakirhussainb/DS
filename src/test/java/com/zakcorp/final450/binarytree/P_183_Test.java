package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_183_Test {
    P_183.Solver p = new P_183.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(44);
        root.left = new BinaryTree.Node(9);
        root.right = new BinaryTree.Node(13);
        root.left.left = new BinaryTree.Node(4);
        root.left.right = new BinaryTree.Node(5);
        root.right.left = new BinaryTree.Node(6);
        root.right.right = new BinaryTree.Node(7);

        assertTrue( p.solve1( root ));
    }
}
