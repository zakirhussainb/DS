package com.zakcorp.final450.searchingandsorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class P_103_Test {
    P_103.Solver p = new P_103.Solver();
    @Test
    public void test1() {
        int[] arr1 = new int[]{1, 5, 9, 10, 15, 20};
        int[] arr2 = new int[]{2, 3, 8, 13};
        List<int[]> list = new ArrayList<>();
        list.add(arr1);
        list.add(arr2);
        assertEquals( list, p.solve1( arr1, arr2) );
    }
}
