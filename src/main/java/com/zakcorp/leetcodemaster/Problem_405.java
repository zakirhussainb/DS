package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_405 {
    static class Solver {
        public String solve1(int num) {
            if(num == 0) {
                return "0";
            }
            char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            StringBuilder sb = new StringBuilder();
            while(num != 0) {
                sb.append(map[(num & 15)]);
                num = (num >>> 4); // similar to num = num / 16;
            }
            return sb.reverse().toString();
        }
    }
}
