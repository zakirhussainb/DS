package com.zakcorp.striver_series.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubsetsII_Test
{
    private SubsetsII.Solver p1 = new SubsetsII.Solver();
    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1,2));
        result.add(Arrays.asList(1,2,2));
        result.add(Arrays.asList(2));
        result.add(Arrays.asList(2,2));
        assertEquals(result, p1.subsetsWithDup(new int[]{1,2,2}));
    }
}
