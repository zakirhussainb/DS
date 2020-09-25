package com.zakcorp.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppendDeleteTest {
    AppendDelete p = new AppendDelete();
    @Test
    public void test1() {
        assertEquals("Yes", p.appendAndDelete("hackerhappy", "hackerrank", 9));
    }
    @Test
    public void test2() {
        assertEquals("Yes", p.appendAndDelete("aba", "aba", 7));
    }
    @Test
    public void test3() {
        assertEquals("No", p.appendAndDelete("ashley", "ash", 2));
    }
    @Test
    public void test4() {
        assertEquals("No", p.appendAndDelete("qwerasdf", "qwerbsdf", 6));
    }

}
