package com.zakcorp.final450.string;

import java.util.*;

public class P_56 {
    // TLE for larger inputs
    static class Solver {
        List<String> list  = new ArrayList<>();
        public List<String> solve1(String input) {
            recursive(input, "");
            return list;
        }
        private void recursive(String input, String output) {
            if( input.isEmpty()) {
                if( !output.isEmpty() )
                    list.add(output);
                return;
            }
            recursive(input.substring(1), output + input.charAt(0));
            recursive(input.substring(1), output);
        }
    }
}
