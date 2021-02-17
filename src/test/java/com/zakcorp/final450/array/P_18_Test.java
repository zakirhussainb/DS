package com.zakcorp.final450.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_18_Test {
    P_18.Solver p = new P_18.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{1, 5, 7, 1}, 4, 6));
        assertEquals(2, p.solve2(new int[]{1, 5, 7, 1}, 4, 6));
    }
    @Test
    public void test2() {
        assertEquals(6, p.solve1(new int[]{1, 1, 1, 1}, 4, 2));
        assertEquals(6, p.solve2(new int[]{1, 1, 1, 1}, 4, 2));
    }
}
