package com.zakcorp.leetcodemaster;

public class Problem_1828
{
    static class Solver {
        public int[] solve1(int[][] points, int[][] queries) {
            int n = queries.length;
            int[] res = new int[n];
            int k = 0;
            for(int[] query : queries) {
                int x2 = query[0];
                int y2 = query[1];
                int radius = query[2];
                int ans = 0;
                for(int[] point : points) {
                    int x1 = point[0];
                    int y1 = point[1];
                    double m = Math.pow( Math.abs(x2 - x1), 2) + Math.pow( Math.abs(y2 - y1), 2);
                    int ceil = (int)Math.ceil(Math.sqrt( m ) );
                    if( ceil <= radius){
                        ans++;
                    }
                }
                res[k++] = ans;
            }
            return res;
        }
    }
}
