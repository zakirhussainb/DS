package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1436_Test {
    Problem_1436 p = new Problem_1436();
    @Test
    public void test1() {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("London", "New York"));
        list.add(Arrays.asList("New York", "Lima"));
        list.add(Arrays.asList("Lima", "Sao Paulo"));
        assertEquals("Sao Paulo", p.destCity(list));
    }
    @Test
    public void test2() {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("B", "C"));
        list.add(Arrays.asList("D", "B"));
        list.add(Arrays.asList("C", "A"));
        assertEquals("A", p.destCity(list));
    }
}
