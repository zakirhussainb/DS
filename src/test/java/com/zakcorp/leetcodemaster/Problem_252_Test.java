package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_252_Test {
    Problem_252.Solver p = new Problem_252.Solver();
    @Test
    public void test1() {
        assertFalse(p.solve1(new int[][]{{0,30},{5,10},{15,20}}));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1(new int[][]{{7,10},{2,4}}));
    }
}
