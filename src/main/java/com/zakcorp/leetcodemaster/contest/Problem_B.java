package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {

    static class Solver1 {
        static class Pair {
            int si;
            int ei;
            int counter;
            public Pair(int si, int ei, int counter) {
                this.si = si;
                this.ei = ei;
                this.counter = counter;
            }
        }
        public int solve1(int[] arr) {
            Map<Integer, Pair> map = new HashMap<>();
            int ans = 0;
            for(int i = 0; i < arr.length; i++) {
                if(map.containsKey(arr[i])) {
                    Pair existing = map.get(arr[i]);
                    existing.ei = i;
                    existing.counter = existing.counter + 1;
                    map.put(arr[i], existing);
                    int x = arr[i] / 2;
                    if(map.containsKey(x)) {
                        Pair mid = map.get(x);
                        if(existing.ei > -1 && mid.si < existing.ei) {
                            ans++;
                        }
                        if(existing.ei > -1 && mid.ei > -1 && mid.ei < existing.ei) {
                            ans++;
                        }
                    }
                } else {
                    map.put(arr[i], new Pair(i, -1, 1));
                }
            }
            return ans;
        }
    }
}
