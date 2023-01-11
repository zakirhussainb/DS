package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_1253
{
    static class Solver {
        public List<List<Integer>> solve1(int upper, int lower, int[] colsum) {
            int[][] mat = new int[2][colsum.length];
            for(int i = 0; i < colsum.length; i++) {
                if(colsum[i] == 2 || colsum[i] == 1 && lower < upper)
                    mat[0][i] = 1;
                if(colsum[i] == 2 || colsum[i] == 1 && mat[0][i] == 0 )
                    mat[1][i] = 1;
                upper -= mat[0][i];
                lower -= mat[1][i];
            }

            return lower == 0 && upper == 0 ? new ArrayList(Arrays.asList( mat[0], mat[1] )) : new ArrayList<>();
        }
    }
}
