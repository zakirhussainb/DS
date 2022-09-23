package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1886_Test {
    Problem_1886.Solver p = new Problem_1886.Solver();
    @Test
    public void test1() {
        assertTrue( p.solve1(new int[][]{{0,0,0}, {0,1,0}, {1,1,1}}, new int[][]{ {1,1,1}, {0,1,0}, {0,0,0} }));
    }
    @Test
    public void test2() {
        assertTrue( p.solve1(new int[][]{{0,1}, {1,0}}, new int[][]{ {1,0}, {0,1} }));
    }
    @Test
    public void test3() {
        assertFalse( p.solve1(new int[][]{{0,1}, {1,1}}, new int[][]{ {1,0}, {0,1} }));
    }
}
