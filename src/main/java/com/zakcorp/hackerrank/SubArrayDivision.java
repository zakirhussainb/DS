package com.zakcorp.hackerrank;

import java.util.*;

/**
 * Created by Zakir Hussain B on 02/10/20.
 *
 * @source: Hackerrank
 * @topic: Algorithms
 * @sub-topic: Implementation
 * @platform: Hackerrank
 * @problem_link: https://www.hackerrank.com/challenges/the-birthday-bar/problem
 * @pseudocode:
 */
public class SubArrayDivision {
    public int birthday(List<Integer> s, int d, int m) {
        int start = 0, ways = 0, sum = 0;
        for(int end = 0; end < s.size(); end++) {
            sum += s.get(end);
            if(end - start + 1 > m) {
                if(sum - s.get(end) == d)
                    ways++;
                sum = sum - s.get(start);
                start++;
            }
        }
        if(sum == d)
            ways++;
        return ways;
    }
}