package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_207_Test {
    Problem_207.Solver p = new Problem_207.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(2, new int[][]{ {1, 0} }));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(2, new int[][]{ {1, 0}, {0, 1} }));
    }
}
