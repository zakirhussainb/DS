package com.zakcorp.final450.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_381_Test {
    P_381.Solver p = new P_381.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve3(3, 2) );
        assertEquals(3, p.solve4(3, 2) );
    }
    @Test
    public void test2() {
        assertEquals(6, p.solve3(4, 2) );
        assertEquals(6, p.solve4(4, 2) );
    }
    @Test
    public void test3() {
        assertEquals(10, p.solve3(5, 2) );
        assertEquals(10, p.solve4(5, 2) );
    }
}
