package com.zakcorp.final450.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_9_Test {
    P_9.Solver p = new P_9.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1(new int[]{1, 5, 8, 10}, 4, 2));
    }
    @Test
    public void test2() {
        assertEquals(11, p.solve1(new int[]{3, 9, 12, 16, 20}, 5, 3));
    }
    @Test
    public void test3() {
        assertEquals(7, p.solve1(new int[]{2, 6, 3, 4,7,2,10,3,2,1}, 10, 5));
    }
}
