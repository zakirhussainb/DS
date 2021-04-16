package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_621 {
    static class Solver {
        public int solve1(char[] tasks, int n) {
            int[] map = new int[26];
            for(char c : tasks) {
                map[c - 'A']++;
            }
            Arrays.sort(map);
            int time = 0;
            while (map[25] > 0) {
                int i = 0;
                while (i <= n) {
                    if (map[25] == 0)
                        break;
                    if (i < 26 && map[25 - i] > 0)
                        map[25 - i]--;
                    time++;
                    i++;
                }
                Arrays.sort(map);
            }
            return time;
        }
        public int solve2(char[] tasks, int n) {
            int[] frequencies = new int[26];
            for (char task : tasks) {
                frequencies[task - 'A']++;
            }
            Arrays.sort(frequencies);
            int fMax = frequencies[25];
            int idleTime = (fMax - 1) * n;
            for (int i = frequencies.length - 2; i >= 0 && idleTime > 0; i--) {
                idleTime = idleTime - Math.min(fMax - 1, frequencies[i]);
            }
            idleTime = Math.max(0, idleTime);
            return idleTime + tasks.length;
        }
    }
}
