package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1496
{
    static class Solver {
        public boolean solve1(String path) {
            int[] initial = {0, 0};
            Set<String> set = new HashSet<>();
            set.add( "0_0" );
            for(char ch : path.toCharArray()) {
                if(ch == 'N') {
                    initial[1]++;
                } else if(ch == 'E') {
                    initial[0]++;
                } else if(ch == 'S') {
                    initial[1]--;
                } else {
                    initial[0]--;
                }
                String str = initial[0] + "_" + initial[1];
                if(set.contains( str )) {
                    return true;
                }
                set.add(str);
            }
            return false;
        }
    }
}
