package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2165
{
    static class Solver {
        public long solve1(long num) {
            StringBuilder sb = new StringBuilder();
            long orgNum = num;
            num = num > 0 ? num : -num;
            long m = 0;
            while(num > 0) {
                m = num % 10;
                sb.insert( 0, m );
                num = num / 10;
            }
            String[] strArr = sb.toString().split( "" );
            if(orgNum > 0) {
                Arrays.sort( strArr );
                int n = strArr.length;
                for(int i = n - 1; i >= 0; i--) {
                    if(i + 1 < n && strArr[i].equals("0") && !strArr[i + 1].equals( "0" )) {
                        swap(i, i + 1, strArr);
                    }
                }
            } else {
                Arrays.sort( strArr, Collections.reverseOrder() );
            }
            String res = convertStringArrayToString(strArr);
            return orgNum > 0 ? Long.parseLong( res ) : -Long.parseLong( res );
        }
        private String convertStringArrayToString(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            for ( String s : strArr )
                sb.append( s );
            return sb.toString();
        }
        private void swap(int x, int y, String[] strArr) {
            String temp = strArr[x];
            strArr[x] = strArr[y];
            strArr[y] = temp;
        }
    }
}
