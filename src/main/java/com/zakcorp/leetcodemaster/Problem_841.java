package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 29/08/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_841 {
    static class Solver {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            Set<Integer> keySet = new HashSet<>();
            keySet.add(0);
            for(int i = 0; i < rooms.size(); i++) {
                for(int j = 0; j < rooms.get(i).size(); j++) {
                    if(keySet.contains(i)) {
                        keySet.add(rooms.get(i).get(j));
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
    static class Solver1 {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            Set<Integer> keySet = new HashSet<>();
            keySet.add(0);
            for (List<Integer> room : rooms) {
                keySet.addAll(room);
            }
            for(int i = 0; i < rooms.size(); i++) {
                if( !keySet.contains(i) ) {
                    return false;
                }
            }
            return true;
        }
    }
}