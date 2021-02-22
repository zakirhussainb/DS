package com.zakcorp.final450.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_88_Test {
    P_88.Solver p = new P_88.Solver();
    @Test
    public void test1() {
        assertTrue( p.solve1("aab", "xxy") );
    }
    @Test
    public void test2() {
        assertFalse( p.solve1("aab", "xyz") );
    }
    @Test
    public void test3() {
        assertFalse( p.solve1("rfkqyuqf", "jkxyqvnr") );
    }
}
