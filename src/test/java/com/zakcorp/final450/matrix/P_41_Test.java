package com.zakcorp.final450.matrix;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class P_41_Test {
    P_41.Solver p = new P_41.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{ {10, 15, 20, 25}, {27, 29, 30, 32}, {33, 35, 37, 39}, {40, 45, 48, 50}}, p.solve1(4, new int[][]{{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}}));
    }
}
