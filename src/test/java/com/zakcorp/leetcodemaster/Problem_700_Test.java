package com.zakcorp.leetcodemaster;

import com.zakcorp.trees.bst.BinarySearchTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_700_Test {
    Problem_700.Solver p = new Problem_700.Solver();
    @Test
    public void test1() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);
        assertEquals(bst.root.left, p.solve1(bst.root, 2));
    }
    @Test
    public void test2() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);
        assertNull(p.solve1(bst.root, 5));
    }
}
