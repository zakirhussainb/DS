package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class P_176_Test {
    P_176.Solver p = new P_176.Solver();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(2);
        root.right = new BinaryTree.Node(3);
        root.left.left = new BinaryTree.Node(4);
        root.right.left = new BinaryTree.Node(5);
        root.right.right = new BinaryTree.Node(6);
        root.right.left.left = new BinaryTree.Node(7);
        root.right.left.right = new BinaryTree.Node(8);
        assertEquals( Arrays.asList(1, 3, 6, 2, 5, 8, 4, 7), p.solve1(root) );
    }
}
