package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_49_Test {
    Problem_49.Solver p = new Problem_49.Solver();
    Problem_49.Solver1 p1 = new Problem_49.Solver1();
    @Test
    public void test1() {
        List<List<String>> list = new ArrayList<>();
        list.add(List.of("bat"));
        list.add(Arrays.asList("nat","tan"));
        list.add(Arrays.asList("ate","eat","tea"));
//        assertEquals(list, p.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        assertEquals(list, p1.solve1(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        /*
        eat - aet
        tea - aet
        ate - aet
        {aet -> {eat, tea, ate}
        nat - ant
        tan - ant
        {ant -> {nat, ant}
        bat - abt
        {abt -> {bat}
         */
    }
}
