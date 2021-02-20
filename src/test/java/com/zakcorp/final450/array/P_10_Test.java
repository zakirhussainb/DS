package com.zakcorp.final450.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_10_Test {
    P_10.Solver p = new P_10.Solver();
    P_10.Solver1 p1 = new P_10.Solver1();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{1, 2, 3, 1, 2, 6}));
        assertEquals(3, p1.solve1(new int[]{1, 2, 3, 1, 2, 6}));
    }

    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{1,3,5,8,9,2,6,7,6,8,9}));
        assertEquals(3, p1.solve1(new int[]{1,3,5,8,9,2,6,7,6,8,9}));
    }

    @Test
    public void test3() {
        assertEquals(2, p.solve1(new int[]{1, 4, 3, 2, 6, 7}));
        assertEquals(2, p1.solve1(new int[]{1, 4, 3, 2, 6, 7}));
    }

}
