package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_257_Test {
    Problem_257.Solver1 p = new Problem_257.Solver1();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        assertEquals(Arrays.asList("1->2->5", "1->3"), p.solve1(root));
    }
}
