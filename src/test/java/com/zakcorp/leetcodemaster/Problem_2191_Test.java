package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_2191_Test
{
    Problem_2191.Solver p = new Problem_2191.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{338,38,991}, p.solve1(new int[]{8,9,4,0,2,1,3,5,7,6}, new int[]{991,338,38}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{123,456,789}, p.solve1(new int[]{0,1,2,3,4,5,6,7,8,9}, new int[]{789,456,123}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{338,338,991}, p.solve1(new int[]{8,9,4,0,2,1,3,5,7,6}, new int[]{991,338,338}));
    }
}
