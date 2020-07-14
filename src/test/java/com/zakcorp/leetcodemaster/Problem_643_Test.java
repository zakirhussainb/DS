package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_643_Test {
    Problem_643.Solver p = new Problem_643.Solver();
    @Test
    public void test1() {
        assertEquals(12.75, p.solve1(new int[]{1,12,-5,-6,50,3}, 4), 0.0);
        assertEquals(12.75, p.solve2(new int[]{1,12,-5,-6,50,3}, 4), 0.0);
    }
    @Test
    public void test2() {
        assertEquals(0.0, p.solve1(new int[]{0,0,0,0}, 1), 0.0);
        assertEquals(0.0, p.solve2(new int[]{0,0,0,0}, 1), 0.0);
    }
    @Test
    public void test3() {
        assertEquals(5.0, p.solve1(new int[]{5}, 1), 0.0);
        assertEquals(5.0, p.solve2(new int[]{5}, 1), 0.0);
    }
    @Test
    public void test4() {
        assertEquals(-1.0, p.solve1(new int[]{-1}, 1), 0.0);
        assertEquals(-1.0, p.solve2(new int[]{-1}, 1), 0.0);
    }
    @Test
    public void test5() {
        assertEquals(8.0, p.solve1(new int[]{1,2,3,4,5,6,7,8,9}, 3), 0.0);
        assertEquals(8.0, p.solve2(new int[]{1,2,3,4,5,6,7,8,9}, 3), 0.0);
    }

}
