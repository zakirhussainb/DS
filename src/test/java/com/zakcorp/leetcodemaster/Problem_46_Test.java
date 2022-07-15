package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_46_Test {
    Problem_46.Solver p = new Problem_46.Solver();
    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1,2,3));
        result.add(Arrays.asList(1,3,2));
        result.add(Arrays.asList(2,1,3));
        result.add(Arrays.asList(2,3,1));
        result.add(Arrays.asList(3,1,2));
        result.add(Arrays.asList(3,2,1));
        result.sort(Comparator.comparingInt(o -> o.get(1)));

        List<List<Integer>> actual = p.solve1(new int[]{1,2,3});
        actual.sort(Comparator.comparingInt(o -> o.get(1)));
        assertEquals(result, actual);
    }

}
