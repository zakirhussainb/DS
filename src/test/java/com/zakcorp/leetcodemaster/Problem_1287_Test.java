package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1287_Test {
    Problem_1287.Solver p = new Problem_1287.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.solve1(new int[]{1,2,2,6,6,6,6,7,10}));
        assertEquals(6, p.solve2(new int[]{1,2,2,6,6,6,6,7,10}));
    }
    @Test
    public void test3() {
        assertEquals(1, p.solve1(new int[]{1}));
        assertEquals(1, p.solve2(new int[]{1}));
    }
    @Test
    public void test4() {
        assertEquals(3, p.solve1(new int[]{1,2,3,3}));
        assertEquals(3, p.solve2(new int[]{1,2,3,3}));
    }
}
