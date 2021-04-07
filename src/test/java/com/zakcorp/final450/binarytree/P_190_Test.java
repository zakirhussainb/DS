package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_190_Test {
    P_190.Solver p = new P_190.Solver();
    P_190.Solver1 p1 = new P_190.Solver1();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(10);
        root.left = new BinaryTree.Node(9);
        root.right = new BinaryTree.Node(8);

        root.left.left = new BinaryTree.Node(7);
        root.left.right = new BinaryTree.Node(6);

        root.right.left = new BinaryTree.Node(5);
        root.right.right = new BinaryTree.Node(4);

        root.left.right.left = new BinaryTree.Node(2);
        root.right.right.left = new BinaryTree.Node(3);

        root.left.right.left.left = new BinaryTree.Node(1);

        BinaryTree.Node lca = root.left;
        assertEquals( lca, p.solve1( root, 7, 1 ) );
        assertEquals( lca, p1.solve1( root, 7, 1 ) );
    }
}
