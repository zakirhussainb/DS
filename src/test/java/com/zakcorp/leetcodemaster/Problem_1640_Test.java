package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1640_Test {
    Problem_1640.Solver p = new Problem_1640.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{91, 4, 64, 78, 12, 45, 11, 2},
                new int[][]{ {78, 12}, {91, 4, 64}, {2}, {45, 11} }));
    }
    @Test
    public void test2() {
        assertTrue(p.solve1(new int[]{85},
                new int[][]{ {85} }));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1(new int[]{49,18,16},
                new int[][]{ {16,18,49} }));
    }
    @Test
    public void test4() {
        assertTrue(p.solve1(new int[]{91,4,64,78},
                new int[][]{ {78},{4,64},{91} }));
    }
    @Test
    public void test5() {
        assertFalse(p.solve1(new int[]{1,3,5,7},
                new int[][]{ {2,4,6,8} }));
    }
}
