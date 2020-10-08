package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_56_Test {
    Problem_56.Solver p = new Problem_56.Solver();
    @Test
    public void test1() {
        System.out.println(p.solve1(new int[][]{ {1,4}, {2,6}, {3,5} }));
    }
}
