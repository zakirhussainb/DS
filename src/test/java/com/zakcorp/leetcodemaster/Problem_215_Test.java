package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_215_Test {
    Problem_215.Solver p = new Problem_215.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(5, p.solve2(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(5, p.solve3(new int[]{3,2,1,5,6,4}, 2));
    }
    @Test
    public void test2() {
        assertEquals(4, p.solve1(new int[]{3,2,3,1,2,4,5,5,6}, 4));
        assertEquals(4, p.solve2(new int[]{3,2,3,1,2,4,5,5,6}, 4));
        assertEquals(4, p.solve3(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
