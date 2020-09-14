package com.zakcorp.hackerrank;

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
        int start = 0, sum = 0, ways = 0;
        for(int end = 0; end < s.size(); end++) {
            sum += s.get(end);
            if(end - start + 1 > m) {
                if(sum - s.get(end) == d) {
                    ways++;
                }
                sum = sum - s.get(start);
                start++;
            }
        }
        if(ways == 0 && sum == d && s.size() == m) {
            return 1;
        }
        return ways;
    }
}