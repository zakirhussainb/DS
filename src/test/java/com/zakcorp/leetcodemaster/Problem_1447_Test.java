package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_1447_Test {
    Problem_1447.Solver p = new Problem_1447.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList("1/2","1/3","1/4","1/5","1/6","2/3","2/5","3/4","3/5","4/5","5/6"),
                p.solve1(6));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList("1/2","1/3","1/4","1/5","1/6","1/7","1/8","1/9","2/3","2/5","2/7","2/9","3/4","3/5",
                        "3/7","3/8","4/5","4/7","4/9","5/6","5/7","5/8","5/9","6/7","7/8","7/9","8/9"),
                p.solve1(9));
    }
}
