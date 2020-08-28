package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1161_Test {
    /**
     * [1,7,0,7,-8,null,null]
     * [2,1,1]
     * [1,0,1]
     * [1,1,1,0,1,1,0]
     */
    Problem_1161.Solver p = new Problem_1161.Solver();
    Problem_1161.Solver1 p1 = new Problem_1161.Solver1();
    @Test
    public void test1() {
        Problem_1161.TreeNode treeNode = new Problem_1161.TreeNode(1);
        treeNode.left = new Problem_1161.TreeNode(7);
        treeNode.right = new Problem_1161.TreeNode(0);
        treeNode.left.left = new Problem_1161.TreeNode(7);
        treeNode.left.right = new Problem_1161.TreeNode(-8);
        assertEquals(2, p.maxLevelSum(treeNode));
        assertEquals(2, p1.maxLevelSum(treeNode));
    }
    @Test
    public void test2() {
        Problem_1161.TreeNode treeNode = new Problem_1161.TreeNode(2);
        treeNode.left = new Problem_1161.TreeNode(1);
        treeNode.right = new Problem_1161.TreeNode(1);
        assertEquals(1, p.maxLevelSum(treeNode));
        assertEquals(1, p1.maxLevelSum(treeNode));
    }
}
