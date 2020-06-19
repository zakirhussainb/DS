package com.zakcorp.trees.binarytree;

import com.zakcorp.gfgmaster.PANTDHS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMaxElement_Test {
    FindMaxElement.Solver p;
    FindMaxElement.Solver1 p1;
    BinaryTree bt;
    @Before
    public void initialize() {
        p = new FindMaxElement.Solver();
        p1 = new FindMaxElement.Solver1();
        bt = new BinaryTree();
    }
    @Test
    public void test1() {
        BinaryTree.Node root = bt.buildTree("1 2 3 4 5 6 7");
        assertEquals(7, p.findMax(root));
        assertEquals(7, p1.findMax(root));
    }
    @Test
    public void test2() {
        BinaryTree.Node root = bt.buildTree("1 2 N");
        assertEquals(2, p.findMax(root));
        assertEquals(2, p1.findMax(root));
    }

}
