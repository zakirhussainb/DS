package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertEquals(210, p.solve1(new int[]{60,60,60}, new int[]{10,90,10}));
    }
    @Test
    public void test2() {
        assertEquals(220, p.solve1(new int[]{20,40,20,70,30}, new int[]{50,20,50,40,20}));
    }
}
