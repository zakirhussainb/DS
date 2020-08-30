package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Problem_841_Test {
    Problem_841.Solver p2 = new Problem_841.Solver();
    @Test
    public void test1() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Collections.singletonList(1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(3));
        rooms.add(new ArrayList<>());
        assertTrue(p2.canVisitAllRooms(rooms));
    }
    @Test
    public void test2() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(0));
        assertFalse(p2.canVisitAllRooms(rooms));
    }
    @Test
    public void test3() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(2));
        assertTrue(p2.canVisitAllRooms(rooms));
    }
    @Test
    public void test4() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Collections.singletonList(1));
        rooms.add(new ArrayList<>());
        rooms.add(Arrays.asList(0, 3));
        rooms.add(Collections.singletonList(1));
        assertFalse(p2.canVisitAllRooms(rooms));
    }
}
