package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_183_Test {
    P_183.Solver p = new P_183.Solver();
    @Test
    public void test1() {
        BinaryTree bt = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node(3);
        root.left = new BinaryTree.Node(1);
        root.right = new BinaryTree.Node(2);

        assertTrue( p.solve1( root ));
    }
}
