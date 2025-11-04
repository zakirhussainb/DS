package com.zakcorp.striver_series.graphs.mst;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindMSTWeight_Kruskals_Test {
    FindMSTWeight_Kruskals.Solver s1 = new FindMSTWeight_Kruskals.Solver();
    @Test
    public void test1() {
        List<List<List<Integer>>> mainList = new ArrayList<>();
        List<List<Integer>> zeroth = new ArrayList<>();
        zeroth.add(Arrays.asList(1,1));
        zeroth.add(Arrays.asList(3,4));
        mainList.add(zeroth);

        List<List<Integer>> first = new ArrayList<>();
        first.add(Arrays.asList(0,1));
        first.add(Arrays.asList(2,2));
        mainList.add(first);

        List<List<Integer>> second = new ArrayList<>();
        second.add(Arrays.asList(1,2));
        second.add(Arrays.asList(3,3));
        mainList.add(second);

        List<List<Integer>> third = new ArrayList<>();
        third.add(Arrays.asList(0,4));
        third.add(Arrays.asList(2,3));
        mainList.add(third);

        assertEquals(6, s1.spanningTree(4, mainList) );
    }

}
