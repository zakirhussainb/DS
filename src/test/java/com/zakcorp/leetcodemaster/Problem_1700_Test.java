package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1700_Test {
    Problem_1700.Solver p = new Problem_1700.Solver();
    @Test
    public void test1() {
        assertEquals(0, p.solve1(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }
}
