package com.zakcorp.final450.string;

import java.util.ArrayList;
import java.util.List;

public class P_57 {
    // TLE for larger inputs
    static class Solver {
        List<String> list  = new ArrayList<>();
        public List<String> solve1(String input) {
            int n  = input.length();
            for(int i = 0; i < n; i++) {
                recursive(input, i);
            }
            return list;
        }
        private void recursive(String input, int index) {
//            if( input.isEmpty()) {
//                if( !output.isEmpty() )
//                    list.add(output);
//                return;
//            }
//            recursive(input.substring(1), output + input.charAt(0));
//            recursive(input.substring(1), output);
        }
    }
}
