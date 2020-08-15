package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_435_Test {
    Problem_435.Solver p = new Problem_435.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[][]{ {1,2},{2,3},{3,4},{1,3} }));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[][]{ {1,2},{1,2},{1,2} }));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1(new int[][]{ {1,2},{2,3} }));
    }
    @Test
    public void test4() {
        assertEquals(0, p.solve1(new int[][]{ {1,2},{3,4} }));
    }
    @Test
    public void test5() {
        assertEquals(0, p.solve1(new int[][]{ {3,4}, {1,2} }));
    }
    @Test
    public void test6() {
        assertEquals(0, p.solve1(new int[][]{}));
    }
    @Test
    public void test7() {
        assertEquals(2, p.solve1(new int[][]{ {1,100}, {11,22}, {1, 11}, {2, 12} }));
    }

}
