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
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3, 5, 8, 9});
        list.add(new int[]{10, 13, 15, 20});
        assertEquals( list, p.solve1( new int[]{1, 5, 9, 10, 15, 20}, new int[]{2, 3, 8, 13} ) );
    }
}
