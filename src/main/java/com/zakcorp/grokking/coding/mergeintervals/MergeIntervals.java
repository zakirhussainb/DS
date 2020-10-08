package com.zakcorp.grokking.coding.mergeintervals;

import java.util.*;

/**
 * Created by Zakir Hussain B on 08/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class MergeIntervals {
    static class Interval {
        int start;
        int end;
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> mergedIntervals = new LinkedList<>();
        int[] scale = new int[15];
        for(int i = 0; i < intervals.size(); i++) {
            int startPos = intervals.get(i).start;
            int endPos = intervals.get(i).end;
            for(int j = startPos; j <= endPos; j++) {
                if(scale[j] == 0) {
                    scale[j] = i + 1;
                }
            }
        }
        int intervalStart = 0, intervalEnd = 0;
        for(int i = 1; i < scale.length; i++) {
            intervalStart = i;
            if(scale[i] != scale[i + 1] ) {
                intervalEnd = i;
                mergedIntervals.add(new Interval(intervalStart, intervalEnd));
            }
        }
        return mergedIntervals;
    }
}