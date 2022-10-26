package com.zakcorp.striver_series.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class L16_M_Coloring_Problem_Test
{
    private L16_M_Coloring_Problem.Solver l16;

    @Before
    public void setup() {
        l16 = new L16_M_Coloring_Problem.Solver();
    }

    @Test
    public void test_colorGraph_1() {
        assertTrue(l16.colorGraph(3, new int[][]{ {1,2}, {2,3}, {3,1} }, 3));
    }

    @Test
    public void test_colorGraph_2() {
        assertTrue(l16.colorGraph(4, new int[][]{ {1,2}, {3,4} }, 4));
    }
    @Test
    public void test_colorGraph_3() {
        assertTrue(l16.colorGraph(4, new int[][]{ {1,2},{2,3},{3,4},{4,1},{1,3},{2,4} }, 4));
    }
}
