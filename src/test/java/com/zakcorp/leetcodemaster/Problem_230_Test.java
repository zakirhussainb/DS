package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_230_Test {
    Problem_230.Solver p = new Problem_230.Solver();
    Problem_230.Solver1 p1 = new Problem_230.Solver1();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        assertEquals(1, p.dfsRecursive(root, 1));
        assertEquals(1, p1.dfsIterative(root, 1));
    }
    @Test
    public void test2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        assertEquals(3, p.dfsRecursive(root, 3));
        assertEquals(3, p1.dfsIterative(root, 3));
    }
}
