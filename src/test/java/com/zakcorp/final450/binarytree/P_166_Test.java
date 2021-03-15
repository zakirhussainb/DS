package com.zakcorp.final450.binarytree;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Test;

public class P_166_Test {
    P_166.Solver p = new P_166.Solver();
    P_166.Solver1 p1 = new P_166.Solver1();
    @Test
    public void test1() {
        BinaryTree.Node root = new BinaryTree.Node(5);
        root.left = new BinaryTree.Node(3);
        root.right = new BinaryTree.Node(6);
        root.left.left = new BinaryTree.Node(2);
        root.left.right = new BinaryTree.Node(4);

        BinaryTree bt = new BinaryTree();

        System.out.println("Before");
        bt.inorderRec(root);
        System.out.println("\nAfter");
//        bt.inorderRec( p.solve1(root) );
        bt.inorderRec( p1.solve1(root) );
    }

    @Test
    public void test2() {
        BinaryTree.Node root = new BinaryTree.Node(2);
        root.left = new BinaryTree.Node(1);
        root.right = new BinaryTree.Node(8);
        root.left.left = new BinaryTree.Node(12);
        root.right.right = new BinaryTree.Node(9);

        BinaryTree bt = new BinaryTree();
        System.out.println("Before");
        bt.inorderRec(root);
        System.out.println("\nAfter");
//        bt.inorderRec( p.solve1(root) );
        bt.inorderRec( p1.solve1(root) );
    }
}
