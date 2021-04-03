package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

public class P_179_Test {
    P_179.Solver p = new P_179.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);

        root.left.left = new BinaryTree.Node(4);
        root.left.right = new BinaryTree.Node(5);

        root.right.left = new BinaryTree.Node(6);
        root.right.right = new BinaryTree.Node(7);

        p.printDLL( p.solve1( root ) );
    }
}
