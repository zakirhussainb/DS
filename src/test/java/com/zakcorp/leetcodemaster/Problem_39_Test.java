package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_39_Test {
    Problem_39.Solver p = new Problem_39.Solver();
    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1,2,2));
        result.add(Arrays.asList(3,2));
        result.add(Arrays.asList(1,1,1,2));
        result.add(Arrays.asList(1,1,3));
        result.add(Arrays.asList(1,1,1,1,1));
        assertEquals(result, p.solve1(new int[]{2, 3, 1}, 5));
    }
}
