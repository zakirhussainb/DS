package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1797_Test
{
    Problem_1797.AuthenticationManager p = new Problem_1797.AuthenticationManager(5);
    @Test
    public void test1() {
        p.renew( "aaa", 1 );
        p.generate( "aaa", 2 );
        assertEquals(1, p.countUnexpiredTokens( 6 ));
        p.generate( "bbb", 7 );
        p.renew( "aaa", 8 );
        p.renew( "bbb", 10 );
        assertEquals(0, p.countUnexpiredTokens( 15 ));
    }

    @Test
    public void test2() {
        p.renew( "aaa", 1 );
        p.generate( "aaa", 2 );
        assertEquals(1, p.countUnexpiredTokens( 6 ));
        p.generate( "bbb", 7 );
        p.renew( "aaa", 8 );
        p.renew( "bbb", 10 );
        assertEquals(0, p.countUnexpiredTokens( 15 ));
    }
}
