package com.zakcorp.final450.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_52_Test {
    P_52.Solver p = new P_52.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1("XY", "12", "1XY2"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1("XY", "12", "Y12X"));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1("ab12", "abb34", "abbab1234"));
    }
}
