package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1060_Test {
    Problem_1060.Solver p = new Problem_1060.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1(new int[]{4,7,9,10}, 1));
    }
    @Test
    public void test2() {
        assertEquals(8, p.solve1(new int[]{4,7,9,10}, 3));
    }
    @Test
    public void test3() {
        assertEquals(6, p.solve1(new int[]{1,2,4}, 3));
    }
}
