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
        result.add(Arrays.asList(2,2,3));
        result.add(Arrays.asList(3,4));
        result.add(Arrays.asList(5,2));
        assertEquals(result, p.solve1(new int[]{2, 3, 5, 4}, 7));
    }
}
