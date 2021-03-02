package com.zakcorp.final450.searchingandsorting;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class P_100_Test {
    P_100.Solver p = new P_100.Solver();
    @Test
    public void test1() {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(-2,-1,1,2));
        resultList.add(Arrays.asList(-2,0,0,2));
        resultList.add(Arrays.asList(-1,0,0,1));
        assertEquals(resultList, p.solve1(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}
