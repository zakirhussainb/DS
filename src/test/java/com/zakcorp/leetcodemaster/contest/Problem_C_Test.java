package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertEquals( 20, p.solve1(new int[]{0, 4}, 5));
    }
    @Test
    public void test2() {
        assertEquals( 216, p.solve1(new int[]{6, 3, 3, 2}, 2));
    }
    @Test
    public void test3() {
        assertEquals( 180820950, p.solve1(new int[]{24,5,64,53,26,38}, 54));
    }
}
