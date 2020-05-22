package com.zakcorp.gfgmaster;

import com.zakcorp.trees.binarytree.BinaryTree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LVOBT_Test {
    LVOBT.Solver p;
    BinaryTree bt;
    @Before
    public void initialize() {
        p = new LVOBT.Solver();
        bt = new BinaryTree();
    }

    @Test
    public void test1() {
        BinaryTree.Node root = bt.getBinaryTree("1 3 2");
        assertEquals("1 3", p.solve(root));
    }

    @Test
    public void test2() {
        BinaryTree.Node root = bt.getBinaryTree("10 20 30 40 60");
        assertEquals("10 20 40", p.solve(root));
    }
}
