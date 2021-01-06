package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_741_Test {
    Problem_741.Solver p = new Problem_741.Solver();
    @Test
    public void test1() {
        assertEquals(0, p.solve1(new int[][]{ {1, -1}, {-1, 1} }));
    }

    @Test
    public void test2() {
        assertEquals(5, p.solve1(new int[][]{ {0, 1, -1}, {1, 0, -1}, {1, 1, 1} }));
    }
}
