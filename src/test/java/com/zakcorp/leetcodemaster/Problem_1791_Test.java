package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1791_Test {
    Problem_1791.Solver p = new Problem_1791.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[][]{{1,2},{2,3},{4,2}}));
        assertEquals(2, p.solve2(new int[][]{{1,2},{2,3},{4,2}}));
    }
}
