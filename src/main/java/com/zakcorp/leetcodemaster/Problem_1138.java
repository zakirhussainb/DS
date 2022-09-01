package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1138
{
    static class Solver {
        static class LetterPosition {
            int x;
            int y;
            public LetterPosition(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
        private final Map<Character, LetterPosition> map;
        public Solver() {
            map = new HashMap<>();
            map.put( 'a', new LetterPosition( 0, 0 ) );
            map.put( 'b', new LetterPosition( 0, 1 ) );
            map.put( 'c', new LetterPosition( 0, 2 ) );
            map.put( 'd', new LetterPosition( 0, 3 ) );
            map.put( 'e', new LetterPosition( 0, 4 ) );


            map.put( 'f', new LetterPosition( 1, 0 ) );
            map.put( 'g', new LetterPosition( 1, 1 ) );
            map.put( 'h', new LetterPosition( 1, 2 ) );
            map.put( 'i', new LetterPosition( 1, 3 ) );
            map.put( 'j', new LetterPosition( 1, 4 ) );

            map.put( 'k', new LetterPosition( 2, 0 ) );
            map.put( 'l', new LetterPosition( 2, 1 ) );
            map.put( 'm', new LetterPosition( 2, 2 ) );
            map.put( 'n', new LetterPosition( 2, 3 ) );
            map.put( 'o', new LetterPosition( 2, 4 ) );

            map.put( 'p', new LetterPosition( 3, 0 ) );
            map.put( 'q', new LetterPosition( 3, 1 ) );
            map.put( 'r', new LetterPosition( 3, 2 ) );
            map.put( 's', new LetterPosition( 3, 3 ) );
            map.put( 't', new LetterPosition( 3, 4 ) );


            map.put( 'u', new LetterPosition( 4, 0 ) );
            map.put( 'v', new LetterPosition( 4, 1 ) );
            map.put( 'w', new LetterPosition( 4, 2 ) );
            map.put( 'x', new LetterPosition( 4, 3 ) );
            map.put( 'y', new LetterPosition( 4, 4 ) );


            map.put( 'z', new LetterPosition( 5, 0 ) );
        }
        public String solve1(String target) {
            StringBuilder res = new StringBuilder();
            LetterPosition curr = new LetterPosition( 0, 0 );
            boolean flagZ = false;
            for(int i = 0; i < target.length(); i++) {
                LetterPosition lp = map.get( target.charAt( i ) );
                int xVal = lp.x - curr.x;
                int yVal = lp.y - curr.y;
                if(xVal > 0) {
                    if(target.charAt(i) == 'z') {
                        xVal--;
                        flagZ = true;
                    }
                    while(xVal --> 0) {
                        res.append( "D" );
                    }
                } else if (xVal < 0){
                    xVal = -xVal;
                    while ( xVal --> 0 ) {
                        res.append( "U" );
                    }
                }

                if(yVal > 0) {
                    while ( yVal --> 0 ) {
                        res.append( "R" );
                    }
                } else if (yVal < 0){
                    yVal = -yVal;
                    while ( yVal --> 0 ) {
                        res.append( "L" );
                    }
                }
                if(flagZ) {
                    res.append( "D" );
                    flagZ = false;
                }
                if(xVal <= 0 && yVal <= 0) {
                    res.append( "!" );
                }

                curr = lp;
            }
            return res.toString();
        }
    }
}
