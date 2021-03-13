package com.zakcorp.final450.linkedlist;

import java.util.*;

public class P_161 {
    static class Solver {
        // aabcdefg
        public String solve1(String str) {
            int n = str.length();
            int i = 0;
            Set<Character> set = new HashSet<>();
            Queue<Character> queue = new LinkedList<>();
            StringBuilder sb = new StringBuilder();
            while(i < n) {
                char ch = str.charAt(i);
                if( !set.contains(ch) ){
                    queue.add(ch);
                    set.add(ch);
                    sb.append(queue.peek());
                } else {
                    queue.remove(ch);
                    if(queue.isEmpty())
                        sb.append("#");
                    else
                        sb.append(queue.peek());
                }
                i++;
            }
            return sb.toString();
        }
    }
}
