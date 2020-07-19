package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_830 {
    public List<List<Integer>> largeGroupPositions(String str) {
        int n = str.length();
        int i = 0, j = 1;
        int counter = 1;
        List<List<Integer>> resultList = new ArrayList<>();
        while(i < n && j < n) {
            List<Integer> list = new ArrayList<>();
            if(str.charAt(i) == str.charAt(j)) {
                counter += 1;
                j++;
            } else {
                if(counter >= 3) {
                    list.add(i);
                    list.add(j - 1);
                }
                i = j;
                j++;
                counter = 1;
            }
            if(!list.isEmpty()) {
                resultList.add(list);
            }
        }
        if(counter >= 3) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(j - 1);
            resultList.add(list);
        }
        return resultList;
    }
}
