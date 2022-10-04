package com.zakcorp.striver_series.recursion;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class L11_SubsetsII_Test
{
    private L11_SubsetsII.Solver l11_1;
    private L11_SubsetsII.Solver1 l11_2;

    @Before
    public void setup() {
        l11_1 = new L11_SubsetsII.Solver();
        l11_2 = new L11_SubsetsII.Solver1();
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
        assertEquals(new HashSet<>(result), new HashSet<>(l11_1.subsetsWithoutDup(new int[]{1,2,2})));
        assertEquals(new HashSet<>(result), new HashSet<>(l11_2.subsetsWithoutDup(new int[]{1,2,2})));
    }
}
