package com.zakcorp.striver_series.graphs.traversals;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ConnectedComponents_Test {
    ConnectedComponents.Solver p1 = new ConnectedComponents.Solver();

    @Test
    public void test1() {
        List<List<Integer>> al = new ArrayList<>();
        al.add(Arrays.asList(0, 1));
        al.add(Arrays.asList(1, 2));
        assertEquals(2, p1.findNumberOfComponents(4, al));
    }
}
