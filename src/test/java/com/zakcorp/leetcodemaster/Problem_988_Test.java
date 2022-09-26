package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_988_Test {
    Problem_988.Solver p = new Problem_988.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        assertEquals("dba", p.solve1(root));
    }
    @Test
    public void test2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(0);
        root.right.left = new TreeNode(0);
        assertEquals("abc", p.solve1(root));
    }
}
