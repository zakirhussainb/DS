package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1759
{
    static class Solver {
        public int solve1(String str) {
            int n = str.length();
            Map<String, Integer> map = new HashMap<>();
            String endCh = "";
            boolean isEndChEmpty = false;
            for(int end = 0; end < n; end++) {
                String currCh = "" + str.charAt( end );
                insertIntoMap( map, currCh );
                if(endCh.isEmpty())
                    isEndChEmpty = true;
                endCh += currCh;
                if(!isEndChEmpty)
                    insertIntoMap( map, endCh );
                if(end + 1 < n && str.charAt( end ) != str.charAt( end + 1 )) {
                    endCh = "";
                }
            }
            int ans = 0;
            for(int num : map.values())
                ans += num;
            return ans;
        }
        private void insertIntoMap(Map<String, Integer> map, String endCh) {
            if(!map.containsKey( endCh )) {
                map.put( endCh, 1 );
            } else {
                map.put( endCh, map.get( endCh ) + 1 );
            }
        }
    }
}
