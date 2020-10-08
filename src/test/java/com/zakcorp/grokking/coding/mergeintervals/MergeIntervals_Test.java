package com.zakcorp.grokking.coding.mergeintervals;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class MergeIntervals_Test {
    MergeIntervals p = new MergeIntervals();
    @Test
    public void test1() {
        MergeIntervals.Interval one = new MergeIntervals.Interval(1, 4);
        MergeIntervals.Interval two = new MergeIntervals.Interval(2, 6);
        MergeIntervals.Interval three = new MergeIntervals.Interval(3, 5);

        MergeIntervals.Interval op1 = new MergeIntervals.Interval(1, 6);

        assertEquals(Collections.singletonList(op1), p.merge(Arrays.asList(one, two, three)));
    }
}
