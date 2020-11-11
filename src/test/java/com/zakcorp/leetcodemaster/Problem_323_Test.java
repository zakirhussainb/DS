package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_323_Test {
    Problem_323.Solver p = new Problem_323.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(5, new int[][]{ {0, 1}, {1, 2}, {3, 4} }));
    }
}
