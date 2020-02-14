package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Problem_621 {
    public static void main(String[] args) {
        char[] chars = {'A','B','A','C','D','D'};
//        int output = leastInterval(chars, 2);
        int output = leastInterval_1(chars, 2);
    }
    public static int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for(char c : tasks){
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
    public static int leastInterval_1(char[] tasks, int n){
        int[] map = new int[26];
        for(char c : tasks){
            map[c - 'A']++;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(26, Collections.reverseOrder());
        for(int f : map){
            if(f > 0){
                priorityQueue.add(f);
            }
        }
        return 0;
    }
}
