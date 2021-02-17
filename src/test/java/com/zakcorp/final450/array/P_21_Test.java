package com.zakcorp.final450.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_21_Test {
    P_21.Solver p = new P_21.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[]{4,2,-3,1,6}, 5));
        assertTrue(p.solve2(new int[]{4,2,-3,1,6}, 5));
    }

    @Test
    public void test2() {
        assertTrue(p.solve1(new int[]{4,2,0,1,6}, 5));
        assertTrue(p.solve2(new int[]{4,2,0,1,6}, 5));
    }
}
