package com.zakcorp.striver_series.recursion;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SubsetsI_Test
{
    private SubsetsI.Solver s1 = new SubsetsI.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(0, 2, 3, 5), s1.subsetSums(new int[]{2, 3}));
    }
}
