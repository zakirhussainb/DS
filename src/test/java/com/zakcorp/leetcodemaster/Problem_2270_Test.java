package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2270_Test {
    Problem_2270.Solver p = new Problem_2270.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{10,4,-8,7}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{2,3,1,0}));
    }
}
