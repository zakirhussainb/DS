package com.zakcorp.hackerrank;

import com.zakcorp.hackerrank.problemsolving.BreakingTheRecords;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BreakingTheRecords_Test {
    BreakingTheRecords p = new BreakingTheRecords();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 4}, p.breakingRecords(new int[]{10,5,20,20,4,5,2,25,1}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{4, 0}, p.breakingRecords(new int[]{3,4,21,36,10,28,35,5,24,42}));
    }

}
