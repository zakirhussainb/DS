package com.zakcorp.final450.bst;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class P_205_Test {
    P_205.Solver p = new P_205.Solver();
    @Test
    public void test1() {
        BinaryTree bt = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node(8);
        root.left = new BinaryTree.Node(3);
        root.right = new BinaryTree.Node(5);
        root.left.left = new BinaryTree.Node(10);
        root.left.right = new BinaryTree.Node(2);
        root.right.left = new BinaryTree.Node(4);
        root.right.right = new BinaryTree.Node(6);

        assertEquals( Arrays.asList(2, 3, 4, 5, 6, 8, 10), bt.inorderList( p.solve1( root ) ) );
    }
}
