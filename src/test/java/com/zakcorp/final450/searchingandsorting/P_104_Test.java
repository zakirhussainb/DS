package com.zakcorp.final450.searchingandsorting;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class P_104_Test {
    P_104.Solver p = new P_104.Solver();
    @Test
    public void test1() {
        int[] arr1 = new int[]{0, 0, 5, 5, 0, 0};
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{0});list.add(new int[]{0});list.add(new int[]{0});list.add(new int[]{0});
        list.add(new int[]{0, 0});list.add(new int[]{0, 0});
        assertEquals( list, p.solve1( arr1 ) );
    }
}
