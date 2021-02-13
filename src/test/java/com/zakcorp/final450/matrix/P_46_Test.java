package com.zakcorp.final450.matrix;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class P_46_Test {
    P_46.Solver p = new P_46.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 8), p.solve1(new int[][]{{1, 2, 1, 4, 8},
                {3, 7, 8, 5, 1},
                {8, 7, 7, 3, 1},
                {8, 1, 2, 7, 9}}));
    }
}
