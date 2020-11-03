package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_406_Test {
    Problem_406.Solver p = new Problem_406.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}}, p.solve1(new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{3,0},{6,0},{7,0},{5,2},{3,4},{5,3},{6,2},{2,7},{9,0},{1,9}},
                p.solve1(new int[][]{{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}}));
    }
}
