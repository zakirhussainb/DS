package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertEquals(7, p.solve1(new int[]{3,2,4,6}));
    }
    @Test
    public void test2() {
        assertEquals(11, p.solve1(new int[]{1,2,3,9,2}));
    }
}
