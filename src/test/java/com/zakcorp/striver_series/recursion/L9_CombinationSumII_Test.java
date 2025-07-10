package com.zakcorp.striver_series.recursion;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class L9_CombinationSumII_Test
{
    private L9_CombinationSumII.Solver p1 = new L9_CombinationSumII.Solver();
    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1,1,6));
        result.add(Arrays.asList(1,2,5));
        result.add(Arrays.asList(1,7));
        result.add(Arrays.asList(2,6));
        assertEquals(result, p1.combinationSum2(new int[]{2, 1, 2, 7, 6, 1, 5}, 8));
    }
}
