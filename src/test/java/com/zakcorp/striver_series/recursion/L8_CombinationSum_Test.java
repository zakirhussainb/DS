package com.zakcorp.striver_series.recursion;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class L8_CombinationSum_Test
{
    private L8_CombinationSum l8;

    @Before
    public void setup() {
        l8 = new L8_CombinationSum();
    }

    @Test
    public void test_FindCombinations() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(2,2,3));
        result.add(List.of(7));
        assertEquals(result, l8.getAllCombinationsWhoseSumIsTarget(new int[]{2,3,6,7}, 7));
    }
}
