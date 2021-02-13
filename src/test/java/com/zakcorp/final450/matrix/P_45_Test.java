package com.zakcorp.final450.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_45_Test {
    P_45.Solver p = new P_45.Solver();
    @Test
    public void test1() {
        assertEquals(30, p.solve1(new int[][]{{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}}, 4, 7));
    }
}
