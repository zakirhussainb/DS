package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;
/*
[[0,30],[5,10],[15,20]]
[[7,10],[2,4]]
[[1,2],[2,3],[3,4]]
[[1,2],[2,3],[3,4],[1,4]]
[]
[[1,2],[1,2]]
[[1,1],[1,1],[1,2]]
[[2,7]]
[[2,11],[6,16],[11,16]]
 */
public class Problem_253_Test {
    Problem_253.Solver p = new Problem_253.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[][]{ {0, 30}, {5, 10}, {15, 20} }));
        assertEquals(2, p.solve2(new int[][]{ {0, 30}, {5, 10}, {15, 20} }));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[][]{ {7, 10}, {2, 4} }));
        assertEquals(1, p.solve2(new int[][]{ {7, 10}, {2, 4} }));
    }
    @Test
    public void test3() {
        assertEquals(2, p.solve1(new int[][]{ {2, 11}, {6, 16}, {11, 16} }));
        assertEquals(2, p.solve2(new int[][]{ {2, 11}, {6, 16}, {11, 16} }));
    }
    @Test
    public void test4() {
        assertEquals(4, p.solve1(new int[][]{ {1, 10}, {2, 7}, {3, 19},  {8, 12},
                {10, 20}, {11, 30} }));
        assertEquals(4, p.solve2(new int[][]{ {1, 10}, {2, 7}, {3, 19},  {8, 12},
                {10, 20}, {11, 30} }));
    }

}
