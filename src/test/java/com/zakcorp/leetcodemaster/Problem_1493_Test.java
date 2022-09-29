package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1493_Test {
    Problem_1493.Solver p = new Problem_1493.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{1,1,0,1}));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1(new int[]{0,1,1,1,0,1,1,0,1}));
    }
    @Test
    public void test3() {
        assertEquals(2, p.solve1(new int[]{1,1,1}));
    }
}
