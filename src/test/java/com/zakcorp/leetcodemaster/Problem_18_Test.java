package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_18_Test {
    Problem_18.Solver p = new Problem_18.Solver();
    Problem_18.Solver1 p1 = new Problem_18.Solver1();

    @Test
    public void test1() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-1, 0, 0, 1));
        output.add(Arrays.asList(-2, -1, 1, 2));
        output.add(Arrays.asList(-2, 0, 0, 2));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve1(new int[]{1, 0, -1, 0, -2, 2}, 0)));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve2(new int[]{1, 0, -1, 0, -2, 2}, 0)));
        assertEquals(new HashSet<>(output), new HashSet<>(p1.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0)));
    }
    @Test
    public void test2() {
        assertEquals(new HashSet<>(), new HashSet<>(p.solve1(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296)));
        assertEquals(new HashSet<>(), new HashSet<>(p.solve2(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296)));
        assertEquals(new HashSet<>(), new HashSet<>(p1.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296)));
    }
}
