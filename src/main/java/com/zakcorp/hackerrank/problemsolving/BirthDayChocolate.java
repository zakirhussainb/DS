package com.zakcorp.hackerrank.problemsolving;

import java.util.*;

/**
 * Created by Zakir Hussain B on 15/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class BirthDayChocolate {
    public int birthday(List<Integer> s, int d, int m) {
        int sum = 0, ways = 0;
        for(int i = 0; i < m; i++) {
            sum = sum + s.get(i);
        }
        for(int i = 0; i < s.size() - m + 1; i++) {
            if(sum == d) {
                ways++;
            }
            if(i + m < s.size()) {
                sum = sum - s.get(i) + s.get(i + m);
            }
        }
        return ways;
    }
}