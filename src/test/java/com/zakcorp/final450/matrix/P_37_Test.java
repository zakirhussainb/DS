package com.zakcorp.final450.matrix;

import com.zakcorp.final450.array.P_1;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class P_37_Test {
    P_37.Solver p = new P_37.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10), p.solve1(new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}}, 4, 4));
    }
}
