package com.zakcorp.final450.greedy;

public class P_231 {
    /*
    * N – Maximum unit of food you can buy each day.
    * S – Number of days you are required to survive.
    * M – Unit of food required each day to survive.
    * Remember you can purchase food on 6 days only as sunday is a holiday.
     */
    static class Solver {
        public Object[] solve1(int S, int N, int M) {
            if( N < M || ( (N * 6) < (M * 7) && S > 6) ) {
                return new Object[]{"NO"};
            } else {
                int days = (M * S) / N;
                if( (M * S) % N != 0) {
                    days++;
                }
                return new Object[]{"YES", days};
            }
        }
    }
}
