package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Problem_2115_Test {
    Problem_2115.Solver p = new Problem_2115.Solver();

    @Test
    public void test1() {
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(Arrays.asList("yeast", "flour"));
        ingredients.add(Arrays.asList("bread", "meat"));

        assertEquals(Arrays.asList("bread"), p.solve1(new String[]{"bread", "sandwich"},
                ingredients, new String[]{"yeast", "flour"}));
    }

    @Test
    public void test3() {
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(Arrays.asList("yeast", "flour"));
        ingredients.add(Arrays.asList("bread", "meat"));
        ingredients.add(Arrays.asList("sandwich", "meat", "bread"));

        assertEquals(Arrays.asList("bread", "sandwich", "burger"), p.solve1(new String[]{"bread", "sandwich", "burger"},
                ingredients, new String[]{"yeast", "flour", "meat"}));
    }

    @Test
    public void test4() {
        List<List<String>> ingredients = new ArrayList<>();
        ingredients.add(Arrays.asList("yeast", "flour"));

        assertEquals(new ArrayList<>(), p.solve1(new String[]{"bread"},
                ingredients, new String[]{"yeast"}));
    }

    @Test
    public void test5() {
        String[][] arr2d = new String[][]{{"wbjr"}, {"otr", "fzr", "g"}, {"fzr", "wi", "otr", "xgp", "wbjr", "igi", "b"}, {"fzr", "xgp", "wi", "otr", "tokfq", "izcad", "igi", "xevvq", "i", "anp"}, {"wi", "xgp", "wbjr"}, {"wbjr", "bxgnm", "i", "b", "hjvu", "izcad", "igi", "z", "g"}, {"xgp", "otr", "wbjr"}, {"wbjr", "otr"}, {"wbjr", "otr", "fzr", "wi", "xgp", "hjvu", "tokfq", "z", "kwdmb"}, {"xgp", "wi", "wbjr", "bxgnm", "izcad", "p", "xevvq"}, {"bxgnm"}, {"wi", "fzr", "otr", "wbjr"}, {"wbjr", "wi", "fzr", "xgp", "otr", "g", "b", "p"}, {"otr", "fzr", "xgp", "wbjr"}, {"xgp", "wbjr", "q", "vpio", "tokfq", "we"}, {"wbjr", "wi", "xgp", "we"}, {"wbjr"}, {"wi"}};
        List<List<String>> ingredients = Arrays.stream(arr2d).map(Arrays::asList).collect(Collectors.toList());
        Set<String> actual = new HashSet<>(p.solve1(new String[]{"xevvq", "izcad", "p", "we", "bxgnm", "vpio", "i", "hjvu", "igi",
                        "anp", "tokfq", "z", "kwdmb", "g", "qb", "q", "b", "hthy"},
                ingredients, new String[]{"wi", "otr", "wbjr", "fzr", "xgp"}));
        assertEquals(new HashSet<>(Arrays.asList("xevvq", "izcad", "bxgnm", "i", "hjvu", "tokfq", "z", "g", "b", "hthy")), actual);
    }
}
