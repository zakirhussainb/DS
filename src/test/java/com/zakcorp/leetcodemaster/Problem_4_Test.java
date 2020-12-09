package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_4_Test {
    Problem_4.Solver p = new Problem_4.Solver();
    @Test
    public void test1() {
        assertEquals(2.00000, p.solve1(new int[]{1,3}, new int[]{2}), 2);
    }
    @Test
    public void test2() {
        assertEquals(-142639.50000, p.solve1(new int[]{-895423,-799411,-728666,-444128,-228396,-56883,197458,685004,888450,996368},
                new int[]{-758255,-745540,-654331,-508374,-400374,-51400,68292,389533,522630,852230}), 1);
    }
}
