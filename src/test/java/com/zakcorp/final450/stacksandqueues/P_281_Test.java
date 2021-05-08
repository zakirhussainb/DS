package com.zakcorp.final450.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_281_Test {
    P_281.Solver p = new P_281.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new long[]{6, 7, 7, -1},  p.solve1( new long[]{5, 6, 3, 7}, 4 ) );
    }
    @Test
    public void test2() {
        assertArrayEquals(new long[]{8,-1,1,3,-1},  p.solve1( new long[]{6,8,0,1,3}, 5 ) );
    }
    @Test
    public void test3() {
        assertArrayEquals(new long[]{12,12,13,9,9,13,-1,8,11,-1,7,-1,6,-1},  p.solve1( new long[]{10,3,12,4,2,9,13,0,8,11,1,7,5,6}, 14 ) );
    }
}
