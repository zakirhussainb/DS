package com.zakcorp.leetcodemaster;

public class Problem_984
{
    static class Solver {
        public String solve1(int A, int B) {
            StringBuilder sb = new StringBuilder(A + B);
            char a = 'a';
            char b = 'b';
            int i = A;
            int j = B;
            if(B > A) {
                a = 'b';
                b = 'a';
                i = B;
                j = A;
            }
            while(i --> 0) {
                sb.append( a );
                if(i > j) {
                    sb.append( a );
                    --i;
                }
                if(j --> 0) {
                    sb.append( b );
                }
            }
            return sb.toString();
        }
    }

    static class Solver1 {
        public String solve1(int A, int B) {
            StringBuilder sb = new StringBuilder(A + B);
            while(A + B > 0) {
                String s = sb.toString();
                if(s.endsWith( "aa" )) {
                    sb.append( "b" );
                    --B;
                } else if(s.endsWith( "bb" )) {
                    sb.append( "a" );
                    --A;
                } else if(A >= B) {
                    sb.append( "a" );
                    --A;
                } else {
                    sb.append( "b" );
                    --B;
                }
            }
            return sb.toString();
        }
    }
}
