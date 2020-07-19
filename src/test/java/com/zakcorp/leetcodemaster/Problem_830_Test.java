package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Problem_830_Test {
    Problem_830 p = new Problem_830();
    @Test
    public void test1() {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(3,6));
        assertEquals(resultList, p.largeGroupPositions("abbxxxxzzy"));
    }
    @Test
    public void test2() {
        assertEquals(new ArrayList<>(), p.largeGroupPositions("abc"));
    }
    @Test
    public void test3() {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(3,5));
        resultList.add(Arrays.asList(6,9));
        resultList.add(Arrays.asList(12,14));
        assertEquals(resultList, p.largeGroupPositions("abcdddeeeeaabbbcd"));
    }
    @Test
    public void test4() {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(0,2));
        assertEquals(resultList, p.largeGroupPositions("aaa"));
    }
}
