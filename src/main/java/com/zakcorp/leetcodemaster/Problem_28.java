package com.zakcorp.leetcodemaster;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem_28 {
    static class Solver {
        public int strStr(String haystack, String needle) {
            if(needle.isEmpty())
                return 0;
            return haystack.indexOf(needle);
        }
    }
}
