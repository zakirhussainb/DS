package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_78_Test {
    Problem_78.Solver p = new Problem_78.Solver();
    @Test
    public void test1() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>()); list.add(Collections.singletonList(1)); list.add(Collections.singletonList(2));
        list.add(Arrays.asList(1, 2));list.add(Collections.singletonList(3));list.add(Arrays.asList(1, 3));
        list.add(Arrays.asList(2, 3));list.add(Arrays.asList(1,2,3));
        assertEquals(list, p.solve1(new int[]{1,2,3}));
    }
}
