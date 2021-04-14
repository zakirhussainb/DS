package com.zakcorp.final450.greedy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P_225_Test {
    P_225.Solver p = new P_225.Solver();
    @Test
    public void test1() {
        assertEquals(24, p.solve1( new int[][] {
                {1000, 1030, 1},
                {1010, 1030, 1},
                {1000, 1020, 2},
                {1030, 1230, 2},
                {1200, 1230, 3},
                {900, 1005, 1},
        }, 3) );
    }

}
