package com.zakcorp.striver_series.graphs.shortestpathalgos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumMulToReachEnd_Test {

    MinimumMulToReachEnd.Solver s1 = new MinimumMulToReachEnd.Solver();
    @Test
    public void test1() {
        assertEquals(2,
                s1.minimumMultiplications(new int[]{ 2, 5, 7 }, 3, 30 ) );
    }
    @Test
    public void test2() {
        assertEquals(4,
                s1.minimumMultiplications(new int[]{ 3, 4, 65 }, 7, 66175 ) );
    }
}
