package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1390_Test {
    Problem_1390.Solver p = new Problem_1390.Solver();
    @Test
    public void test1() {
        assertEquals(32, p.solve1(new int[]{21, 4, 7}));
    }
    @Test
    public void test2() {
        assertEquals(64, p.solve1(new int[]{21,21}));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1(new int[]{1,2,3,4,5}));
    }
}
