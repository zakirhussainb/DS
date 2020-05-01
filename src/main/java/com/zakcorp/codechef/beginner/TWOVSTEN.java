package com.zakcorp.codechef.beginner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TWOVSTEN {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = in.readInt();
                out.printLine(new Solver().solve(n));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int n){
            // Any number that is not ending with 0 or 5 can never be divisible by 10, basic math rule for divisibility by 10.
            // Even if you multiply the number by 2, n number of times, you would still never get that number.
            if(n % 10 == 0){
                return 0; // minimum number of turns 0 in this case
            } else if(n % 5 == 0) {
                return 1; // minimum number of turns 1 in this case, as the number ends with 5.
            }
            return -1;
        }
    }
}
