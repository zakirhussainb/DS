package com.zakcorp.final450.greedy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_233_Test {
    P_233.Solver p = new P_233.Solver();
    @Test
    public void test1() {
        assertEquals(24, p.solve1(new int[] {-1, -1, -2, 4, 3}) );
    }

    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[] {-1, 0}) );
    }

    @Test
    public void test3() {
        assertEquals(0, p.solve1(new int[] {0, 0, 0}) );
    }
}
