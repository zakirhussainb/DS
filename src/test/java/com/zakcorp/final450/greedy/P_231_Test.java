package com.zakcorp.final450.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_231_Test {
    P_231.Solver p = new P_231.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new Object[]{"YES", 2}, p.solve1(10, 16, 2) );
    }

    @Test
    public void test2() {
        assertArrayEquals(new Object[]{"NO"}, p.solve1(10, 20, 30) );
    }

    @Test
    public void test3() {
        assertArrayEquals(new Object[]{"YES", 4}, p.solve1(10, 5, 2) );
    }
}
