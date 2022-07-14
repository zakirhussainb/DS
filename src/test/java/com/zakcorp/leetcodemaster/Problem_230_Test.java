package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_230_Test {
    Problem_230.Solver p = new Problem_230.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        assertEquals(1, p.dfsRecursive(root, 1));
    }
}
