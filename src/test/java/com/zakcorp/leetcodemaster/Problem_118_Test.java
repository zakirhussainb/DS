package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Problem_118_Test {
    Problem_118.Solver p = new Problem_118.Solver();
    @Test
    public void test1() {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        res.add(List.of(1,1));
        res.add(List.of(1,2,1));
        res.add(List.of(1,3,3,1));
        res.add(List.of(1,4,6,4,1));
        assertEquals(res, p.solve1(5));
    }
}
