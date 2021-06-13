package com.zakcorp.final450.dp;

import com.zakcorp.dynamicprogramming.AllConstruct;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_379_Test {
    P_379.Solver p = new P_379.Solver();
    P_379.Solver2 p2 = new P_379.Solver2();
    @Test
    public void test1() {
//        assertEquals(4, p.recursive(new int[]{1, 2, 3}, 4) );
        assertEquals(4, p2.tabulation(new int[]{1, 2, 3}, 4) );
    }
}
