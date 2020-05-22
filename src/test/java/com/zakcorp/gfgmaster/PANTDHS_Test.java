package com.zakcorp.gfgmaster;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PANTDHS_Test {
    PANTDHS.Solver p;
    BinaryTree bt;
    @Before
    public void initialize() {
        p = new PANTDHS.Solver();
        bt = new BinaryTree();
    }

    @Test
    public void test1() {
//        BinaryTree.Node root = bt.buildTree("1 2 3 N N 4 6 N 5 N N 7 N");
        BinaryTree.Node root = bt.buildTree("37 20 N 113");
        assertEquals("20 113", p.solve(root));
    }

//    @Test
//    public void test2() {
//        BinaryTree.Node root = bt.getBinaryTree("10 20 30 40 60");
//        assertEquals("10 20 40", p.solve(root));
//    }
}
