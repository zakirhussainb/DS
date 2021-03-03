package com.zakcorp.final450.searchingandsorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_107_Test {
    P_107.Solver p = new P_107.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{4, 3, 2, 1}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{1, 5, 4, 3, 2}));
    }
}
