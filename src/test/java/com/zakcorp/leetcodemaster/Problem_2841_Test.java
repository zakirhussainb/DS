package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_2841_Test {
    Problem_2841.Solver p = new Problem_2841.Solver();
    @Test
    public void test1() {
        assertEquals(18, p.solve1(Arrays.asList(2,6,7,3,1,7), 3, 4));
    }
    @Test
    public void test2() {
        assertEquals(23, p.solve1(Arrays.asList(5,9,9,2,4,5,4), 1, 3));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1(Arrays.asList(1,2,1,2,1,2,1), 3, 3));
    }
    @Test
    public void test4() {
        assertEquals(4, p.solve1(Arrays.asList(1,1,1,3), 2, 2));
    }

}
