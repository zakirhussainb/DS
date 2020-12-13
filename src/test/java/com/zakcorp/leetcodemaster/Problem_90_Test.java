package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_90_Test {
    Problem_90.Solver p = new Problem_90.Solver();
    @Test
    public void test1() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>()); list.add(Collections.singletonList(1)); list.add(Collections.singletonList(2));
        list.add(Arrays.asList(1, 2));list.add(Arrays.asList(2, 2));list.add(Arrays.asList(1, 2, 2));
        assertEquals(list, p.solve1(new int[]{1,2,2}));
    }
}
