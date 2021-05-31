package com.zakcorp.final450.string;

import java.util.*;

public class P_89 {
    static class Solver {
        List<String> result = new ArrayList<>();
        public List<String> solve1(String[][] input) {
            recursive( input, 0, 0, new StringBuilder() );
            return result;
        }
        private void recursive(String[][] input, int m, int n, StringBuilder sb) {
            sb.append(input[m][n]);
            if(m == input.length - 1) {
                for(int i = 0; i < input.length; i ++) {
                    sb.append(" ");
                }
                sb.append(input[m][n]);
                result.add(sb.toString());
                sb.setLength(0);
                return;
            }
            if(n >= input[0].length - 1)
                return;

            for(int i = m; i < input.length; i++) {
                for(int j = n; j < input[0].length; j++) {
                    sb.append(input[i][j]).append(" ");
                    recursive(input, i + 1, j, sb);
                }
            }
        }


    }
}
