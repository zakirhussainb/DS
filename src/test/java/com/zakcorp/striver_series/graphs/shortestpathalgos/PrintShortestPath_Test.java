package com.zakcorp.striver_series.graphs.shortestpathalgos;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PrintShortestPath_Test {

    PrintShortestPath.Solver s1 = new PrintShortestPath.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(5, 1, 4, 3, 5),
                s1.shortestPath(5, 6, new int[][]{ {1,2,2}, {2,5,5}, {2,3,4}, {1,4,1}, {4,3,3}, {3,5,1} } ) );
    }
}
