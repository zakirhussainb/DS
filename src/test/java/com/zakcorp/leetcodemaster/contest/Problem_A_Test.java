package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1,1,6));
        result.add(Arrays.asList(1,2,5));
        result.add(Arrays.asList(1,7));
        result.add(Arrays.asList(2,6));
        assertEquals(result, p.solve1(new int[]{2, 1, 2, 7, 6, 1, 5}, 8));
    }
}
