package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_5554 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        /*Map<Integer, Integer> match = new HashMap<>();
        for(int i = 0; i < pieces.length; i++) {
            for(int j = 0; j < pieces[i].length; j++) {
                match.put(pieces[i][j], i);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(!match.containsKey(arr[i])) {
                return false;
            }
            int[] p = pieces[match.get(arr[i])];
            for(int j = 0; j < p.length; j++) {
                if(arr[i] != p[j]) {
                    return false;
                }
                i++;
            }
            i--;
        }
        */
        return true;
    }
}
