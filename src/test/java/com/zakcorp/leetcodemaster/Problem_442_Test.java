package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class Problem_442_Test {
    Problem_442.Solver p = new Problem_442.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(2, 3) ,p.solve1(new int[]{4,3,2,7,8,2,3,1}));
        assertEquals(Arrays.asList(2, 3) ,p.solve2(new int[]{4,3,2,7,8,2,3,1}));
        assertEquals(Arrays.asList(2, 3) ,p.solve3(new int[]{4,3,2,7,8,2,3,1}));
        assertEquals(Arrays.asList(2, 3) ,p.solve4(new int[]{4,3,2,7,8,2,3,1}));
    }
    @Test
    public void test2() {
        assertEquals(Collections.singletonList(2),p.solve1(new int[]{2,2}));
        assertEquals(Collections.singletonList(2),p.solve2(new int[]{2,2}));
        assertEquals(Collections.singletonList(2),p.solve3(new int[]{2,2}));
        assertEquals(Collections.singletonList(2),p.solve4(new int[]{2,2}));
    }
}
