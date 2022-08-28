package com.zakcorp.leetcodemaster;

public class Problem_1904
{
    /*
    Total number of minutes in a day => 24 * 60 => Number of Hours * Number of Minutes in an Hour => 1440 minutes
    To find out the minutes for a particular time => you can simply multiply the hour by 60 and add the minutes to the result
        For e.g. 21 : 30 => 60 * 21 + 30 => 1260 + 30 => 1290 minutes
                 03 : 00 => 60 * 3 + 0 => 180 minutes
                 Here the start > end :
                    So the time you have played is { from 1290 to 1440 } and { from 0 to 180 }
                        sT -> (1440 - 1290) / 15
                        eT -> 180 / 15
                        return sT + eT
                 ELSE
                    This is for case, { 09:31 and 10:14 }
                    Max(0, (end / 15) - (start + 14) / 15) )
                        Why do we take Max(0, ans)
                        -> We need to take maximum of -ve value and 0 { from "00:47" to "00:57" }
                        Why do we need (start + 14)
                        -> You need to round up the start to later quarter. So for example "00:01" and "01:00" the start
                         becomes "00:15" to get that you might think you can convert "00:01" int 1min and ((1min / 15)+1) * 15)
                         and yes you get start=15mins and end=60mins. Result is (60-15) / 15 = 3.
                         Now consider this example, "00:00" "01:00", the above formula wont work since it takes you to
                         start=15mins, rather than start=0mins. So if you add 14 and then divide 14, it makes sure that
                          the quarter can come automatically to next quarter. (add 14 to 0min it makes it current quarter
                          but anything post that takes you automatically to next quarter)
     */
    static class Solver {
        public int solve1(String loginTime, String logoutTime) {
            int startMinutes = getMinutes(loginTime);
            int endMinutes = getMinutes(logoutTime);
            if(startMinutes > endMinutes) {
                int sT = (1440 - startMinutes) / 15;
                int eT = endMinutes / 15;
                return sT + eT;
            } else {
                return Math.max(0, (endMinutes / 15) - (startMinutes + 14) / 15);
            }
        }
        private int getMinutes(final String s) {
            int hh = Integer.parseInt(s.substring(0, 2)); // 21
            int mm = Integer.parseInt(s.substring(3)); // 30
            return 60 * hh + mm;
        }
    }
}
