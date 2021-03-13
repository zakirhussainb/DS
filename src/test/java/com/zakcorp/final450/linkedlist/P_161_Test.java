package com.zakcorp.final450.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_161_Test {
    P_161.Solver p = new P_161.Solver();
    @Test
    public void test1() {
        assertEquals("hhhhhhhhhhhhhhhhhh", p.solve1("hrqcvsvszpsjammdrw"));
    }
    @Test
    public void test2() {
        assertEquals("a#bbbbbb", p.solve1("aabcdefg"));
    }
}
