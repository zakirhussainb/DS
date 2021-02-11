package com.zakcorp.final450.searchingandsorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P_105_Test {
    P_105.Solver p = new P_105.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new long[]{180,600,360,300,900}, p.solve1(new int[]{10, 3, 5, 6, 2}, 5));
        assertArrayEquals(new long[]{180,600,360,300,900}, p.solve2(new int[]{10, 3, 5, 6, 2}, 5));
    }
}
