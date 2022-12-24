package com.zakcorp.leetcodemaster;

public class Problem_984
{
    /*
        1. If the initial number of A's is greater than B's, we swap A and B.
        2. For each turn, we add <a> to our string.
        3. If the no. of remaining A's is greater than B's, we add one more <a>.
        4. Finally we add <b>.
     */
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
        /*
            1. If the current resultant string,
                -> ends with "aa", next char is "b";
                -> if ends with "bb", next char is "a";
            2. Otherwise, A >= B, then next char is "a" or else "b"
            3. Decrement A and B as you append it to the result.
         */
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
