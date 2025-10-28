package com.zakcorp.striver_series.graphs.shortestpathalgos;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class NumberOfWaysToArriveAtDest_Test {

    NumberOfWaysToArriveAtDest.Solver s1 = new NumberOfWaysToArriveAtDest.Solver();
    @Test
    public void test1() {
        List<List<Integer>> roads = Arrays.asList(
                Arrays.asList(0, 6, 7),
                Arrays.asList(0, 1, 2),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 3),
                Arrays.asList(6, 3, 3),
                Arrays.asList(3, 5, 1),
                Arrays.asList(6, 5, 1),
                Arrays.asList(2, 5, 1),
                Arrays.asList(0, 4, 5),
                Arrays.asList(4, 6, 2)
        );
        assertEquals(4, s1.countPaths(7, roads ) );
    }
}
