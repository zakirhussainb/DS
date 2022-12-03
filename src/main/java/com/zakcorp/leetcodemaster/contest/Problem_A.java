package com.zakcorp.leetcodemaster.contest;

import java.math.BigDecimal;

public class Problem_A {
    static class Solver {
        public int solve1(String num) {
            BigDecimal bd = new BigDecimal( num );
            BigDecimal res = BigDecimal.ZERO;
            BigDecimal i = BigDecimal.ONE;
            while ( i.compareTo( bd ) <= 0 )
            {
                String s = i.toString();
                if(s.contains( "1" )) {
                    res = res.add( BigDecimal.ONE );
                }
                i = i.add( BigDecimal.ONE  );
            }
            return res.intValue();
        }
    }
}
