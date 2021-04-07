package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_196_Test {

    P_196.Solver p = new P_196.Solver();

    @Test
    public void test1() {
        BinaryTree.Node root1 = new BinaryTree.Node(1);
        root1.left = new BinaryTree.Node(2);
        root1.right = new BinaryTree.Node(3);

        root1.left.left = new BinaryTree.Node(4);
        root1.left.right = new BinaryTree.Node(5);
        root1.right.left = new BinaryTree.Node(6);

        root1.left.right.left = new BinaryTree.Node(7);
        root1.left.right.right = new BinaryTree.Node(8);

        BinaryTree.Node root2 = new BinaryTree.Node(1);
        root2.left = new BinaryTree.Node(3);
        root2.right = new BinaryTree.Node(2);

        root2.left.right = new BinaryTree.Node(6);
        root2.right.left = new BinaryTree.Node(4);
        root2.right.right = new BinaryTree.Node(5);
        root2.right.right.left = new BinaryTree.Node(8);
        root2.right.right.right = new BinaryTree.Node(7);

        assertTrue( p.solve1( root1, root2 ) );
    }

    @Test
    public void test2() {
        BinaryTree.Node root1 = new BinaryTree.Node(1);
        root1.left = new BinaryTree.Node(2);
        root1.right = new BinaryTree.Node(3);

        root1.left.left = new BinaryTree.Node(4);
        root1.left.right = new BinaryTree.Node(5);
        root1.right.left = new BinaryTree.Node(6);

        root1.left.right.left = new BinaryTree.Node(7);
        root1.left.right.right = new BinaryTree.Node(8);

        assertTrue( p.solve1( root1, root1 ) );
    }
}
