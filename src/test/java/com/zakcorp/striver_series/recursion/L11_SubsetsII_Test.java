package com.zakcorp.striver_series.recursion;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class L11_SubsetsII_Test
{
    private L11_SubsetsII l11;

    @Before
    public void setup() {
        l11 = new L11_SubsetsII();
    }

    @Test
    public void test_FindCombinations() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of());
        result.add(List.of(1));
        result.add(List.of(1,2));
        result.add(List.of(1,2,2));
        result.add(List.of(2));
        result.add(List.of(2,2));
        assertEquals(result, l11.subsetsWithoutDup(new int[]{1,2,2}));
    }
}
