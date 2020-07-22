package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1436 {
    public String destCity(List<List<String>> paths) {
        Set<String> srcCities = new HashSet<>();
        for(List<String> path : paths) {
            srcCities.add(path.get(0));
        }
        for(List<String> path : paths) {
            if(!srcCities.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}
