package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_3211_Test {
    Problem_3211.Solver p = new Problem_3211.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList("010","011","101","110","111"), p.solve1(3));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList("01","10","11"), p.solve1(2));
    }

}
