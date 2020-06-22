package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.*;

public class Problem_1002_Test {
    Problem_1002.Solver p = new Problem_1002.Solver();

    @Test
    public void test1() {
        List<String> expected = Arrays.asList("e","l","l");
        assertEquals(expected, p.commonChars(new String[]{"bella","label","roller"}));
    }
    @Test
    public void test2() {
        List<String> expected = Arrays.asList("c","o");
        assertEquals(expected, p.commonChars(new String[]{"cool","lock","cook"}));
    }
    @Test
    public void test3() {
        List<String> expected = Arrays.asList("a","b","c","c","d","d");
        assertEquals(expected, p.commonChars(new String[]{"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"}));
    }

}
