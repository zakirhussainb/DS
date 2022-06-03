package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_103_Test {
    Problem_103.Solver p = new Problem_103.Solver();
    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(3));
        result.add(Arrays.asList(20, 9));
        result.add(Arrays.asList(15, 7));

        Problem_103.TreeNode root = new Problem_103.TreeNode(3);
        root.left = new Problem_103.TreeNode(9);
        root.right = new Problem_103.TreeNode(20);
        root.right.left = new Problem_103.TreeNode(15);
        root.right.right = new Problem_103.TreeNode(7);
        assertEquals(result, p.solve1(root));
    }
}
