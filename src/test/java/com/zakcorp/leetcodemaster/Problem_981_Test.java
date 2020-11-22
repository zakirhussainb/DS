package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_981_Test {
    Problem_981.Solver p = new Problem_981.Solver();
    @Test
    public void test1() {
        p.set("foo","bar",1);
//        assertEquals("bar", p.get("foo",1));
        assertEquals("bar", p.get("foo",3));
//        p.set("foo","bar2",4);
//        assertEquals("bar2", p.get("foo",4));
//        assertEquals("bar2", p.get("foo",5));
    }
}
