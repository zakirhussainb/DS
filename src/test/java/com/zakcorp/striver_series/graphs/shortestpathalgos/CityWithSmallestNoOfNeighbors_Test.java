package com.zakcorp.striver_series.graphs.shortestpathalgos;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityWithSmallestNoOfNeighbors_Test {

    CityWithSmallestNoOfNeighbors.Solver s1 = new CityWithSmallestNoOfNeighbors.Solver();
    @Test
    public void test1() {
        int[][] edges = new int[][]{{0, 1, 3}, {1,2,1}, {1,3,4}, {2,3,1}};
        assertEquals(3, s1.findCity(4, 4, edges, 4));
    }

}
