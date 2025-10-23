package com.zakcorp.striver_series.graphs.shortestpathalgos;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CheapestFlightWithinKStops_Test {

    CheapestFlightWithinKStops.Solver s1 = new CheapestFlightWithinKStops.Solver();
    @Test
    public void test1() {
        assertEquals(700,
                s1.cheapestFlight(4, new int[][]{ {0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200} }, 0, 3, 1) );
    }

    @Test
    public void test2() {
        assertEquals(200,
                s1.cheapestFlight(3, new int[][]{ {0,1,100}, {1,2,100}, {0,2,500} }, 0, 2, 1) );
    }
}
