package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1457_Test {
    Problem_1457.Solver p = new Problem_1457.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        assertEquals(2, p.solve1(root));
    }
}
