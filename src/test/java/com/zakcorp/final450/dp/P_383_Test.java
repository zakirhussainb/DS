package com.zakcorp.final450.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_383_Test {
    P_383.Solver p = new P_383.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve2(2) );
        assertEquals(2, p.solve3(2) );
    }
    @Test
    public void test2() {
        assertEquals(14, p.solve2(4) );
        assertEquals(14, p.solve3(4) );
    }
    @Test
    public void test3() {
        assertEquals(42, p.solve2(5) );
        assertEquals(42, p.solve3(5) );
    }
}
