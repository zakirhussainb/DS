package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class P_180_Test {
    P_180.Solver p = new P_180.Solver();
    @Test
    public void test1() {
        BinaryTree bt = new BinaryTree();
        BinaryTree.Node root = new BinaryTree.Node(10);
        root.left = new BinaryTree.Node(-2);
        root.right = new BinaryTree.Node(6);

        root.left.left = new BinaryTree.Node(8);
        root.left.right = new BinaryTree.Node(-4);

        root.right.left = new BinaryTree.Node(7);
        root.right.right = new BinaryTree.Node(5);
        bt.inorderRec( p.solve1(root) );
    }
}
