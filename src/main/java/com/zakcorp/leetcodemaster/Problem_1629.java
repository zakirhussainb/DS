package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 25/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_1629 {
    static class Solver {
        public char solve1(int[] releaseTimes, String keysPressed) {
            int n = releaseTimes.length;
            List<Character> list = new ArrayList<>();
            int max = releaseTimes[0];
            for(int i = 1; i < n; i++) {
                int val = releaseTimes[i] - releaseTimes[i - 1];
                if(val > max) {
                    max = val;
                    list.clear();
                    list.add(keysPressed.charAt(i));
                } else if(val == max) {
                    list.add(keysPressed.charAt(i));
                }
            }
            if(list.isEmpty()) {
                return keysPressed.charAt(0);
            }
            if(list.size() == 1) {
                return list.get(0);
            }
            char res = list.get(0);
            for(int i = 1; i < list.size(); i++) {
                if(list.get(i) > res) {
                    res = list.get(i);
                }
            }
            return res;
        }
    }
}