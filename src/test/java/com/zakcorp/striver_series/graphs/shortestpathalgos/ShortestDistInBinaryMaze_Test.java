package com.zakcorp.striver_series.graphs.shortestpathalgos;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShortestDistInBinaryMaze_Test {

    ShortestDistInBinaryMaze.Solver s1 = new ShortestDistInBinaryMaze.Solver();
    @Test
    public void test1() {
        assertEquals(3,
                s1.shortestPath(new int[][]{ {1,1,1,1}, {1,1,0,1}, {1,1,1,1}, {1,1,0,0}, {1,0,0,1} }, new int[]{0, 1}, new int[]{2, 2} ) );
    }

    @Test
    public void test2() {
        assertEquals(-1,
                s1.shortestPath(new int[][]{ {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,0}, {1,0,1,0,1} }, new int[]{0, 0}, new int[]{3, 4} ) );
    }
}
