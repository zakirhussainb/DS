package com.zakcorp.final450.greedy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_219_Test {
    P_219.Solver p = new P_219.Solver();
    @Test
    public void test1() {
        assertEquals( 4, p.solve1(new int[]{1,3,0,5,8,5}, new int[]{2,4,6,7,9,9}, 6));
    }
}
