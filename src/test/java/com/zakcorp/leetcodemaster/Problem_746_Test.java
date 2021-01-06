package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_746_Test {
    Problem_746.Solver p = new Problem_746.Solver();
    Problem_746.Solver1 p1 = new Problem_746.Solver1();
    Problem_746.Solver2 p2 = new Problem_746.Solver2();
    @Test
    public void test1() {
//        assertEquals(6, p.solve1(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        assertEquals(6, p1.solve1(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        assertEquals(6, p2.solve1(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
    @Test
    public void test2() {
//        assertEquals(6, p.solve1(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        assertEquals(15, p1.solve1(new int[]{10, 15, 20}));
        assertEquals(15, p2.solve1(new int[]{10, 15, 20}));
    }

}
