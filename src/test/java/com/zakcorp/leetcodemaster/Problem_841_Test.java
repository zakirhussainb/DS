package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Problem_841_Test {
//    Problem_841.Solver p = new Problem_841.Solver();
//    Problem_841.Solver1 p1 = new Problem_841.Solver1();
    Problem_841.Solver2 p2 = new Problem_841.Solver2();
    @Test
    public void test1() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Collections.singletonList(1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(3));
        rooms.add(new ArrayList<>());
//        assertTrue(p.canVisitAllRooms(rooms));
//        assertTrue(p1.canVisitAllRooms(rooms));
        assertTrue(p2.canVisitAllRooms(rooms));
    }
    @Test
    public void test2() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(0));
//        assertFalse(p.canVisitAllRooms(rooms));
//        assertFalse(p1.canVisitAllRooms(rooms));
        assertFalse(p2.canVisitAllRooms(rooms));
    }
    @Test
    public void test3() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(2));
//        assertFalse(p.canVisitAllRooms(rooms));
//        assertFalse(p1.canVisitAllRooms(rooms));
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
