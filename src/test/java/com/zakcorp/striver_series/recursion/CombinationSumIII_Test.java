package com.zakcorp.striver_series.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationSumIII_Test
{
    private CombinationSumIII.Solver s1 = new CombinationSumIII.Solver();
    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1,2,4));
        assertEquals(result, s1.combinationSum3(3, 7));
    }
}
