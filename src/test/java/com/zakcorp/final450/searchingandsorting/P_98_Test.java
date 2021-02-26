package com.zakcorp.final450.searchingandsorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_98_Test {
    P_98.Solver p = new P_98.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{4, 5, 6, 7, 6}, 5, 6, 1));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1(new int[]{20, 40, 50, 70, 70, 60}, 6, 60, 20));
    }
}
