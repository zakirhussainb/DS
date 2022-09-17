package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        Map<Integer, Integer> map;
        public Solver() {
            map = new HashMap<>();
            map.put(1, 0);
            map.put(2, 31);
            map.put( 3, 59 );
            map.put( 4, 90 );
            map.put( 5, 120 );
            map.put( 6, 151 );
            map.put( 7, 181 );
            map.put( 8, 212 );
            map.put( 9, 243 );
            map.put( 10, 273 );
            map.put( 11, 304 );
            map.put( 12, 334 );
        }
        public int solve1(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
            int[] days = new int[366];
            int arr_aliceDate = Integer.parseInt( arriveAlice.substring( 3 ) );
            int leave_aliceDate = Integer.parseInt( leaveAlice.substring( 3 ) );
            int arr_bobDate = Integer.parseInt( arriveBob.substring( 3 ) );
            int leave_bobDate = Integer.parseInt( leaveBob.substring( 3 ) );
            int arr_aliceMonth = Integer.parseInt( arriveAlice.substring( 0, 2 ) );
            int leave_aliceMonth = Integer.parseInt( leaveAlice.substring( 0, 2 ) );
            int arr_bobMonth = Integer.parseInt( arriveBob.substring( 0, 2 ) );
            int leave_bobMonth = Integer.parseInt( leaveBob.substring( 0, 2 ) );

            int alice_calcDate_arrival =  map.get( arr_aliceMonth ) + arr_aliceDate;
            int alice_calcDate_leave = map.get( leave_aliceMonth ) + leave_aliceDate;
            for(int i = alice_calcDate_arrival; i <= alice_calcDate_leave; i++) {
                days[i] += 1;
            }
            int bob_calcDate_arrival =  map.get( arr_bobMonth ) + arr_bobDate;
            int bob_calcDate_leave = map.get( leave_bobMonth ) + leave_bobDate;
            for(int i = bob_calcDate_arrival; i <= bob_calcDate_leave; i++) {
                days[i] += 1;
            }
            int ans = 0;
            for ( int day : days )
            {
                if ( day >= 2 )
                {
                    ans++;
                }
            }
            return ans;
        }
    }
}
