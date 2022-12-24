package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_2300_Test
{
    Problem_2300.Solver p = new Problem_2300.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 0, 3}, p.solve1(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{3, 0, 3}, p.solve1(new int[]{15, 8, 19}, new int[]{38, 36, 23}, 328));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{0,0,0,1,3,3,4}, p.solve1(new int[]{1,2,3,4,5,6,7}, new int[]{1,2,3,4,5,6,7}, 25));
    }
}
