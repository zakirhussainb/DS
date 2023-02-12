package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_900_Test
{
    @Test
    public void test1() {
        Problem_900.RLEIterator p = new Problem_900.RLEIterator(new int[]{3, 8, 0, 9, 2, 5});
        assertEquals(8, p.next( 2 ));
        assertEquals(8, p.next( 1 ));
        assertEquals(5, p.next( 1 ));
        assertEquals(-1, p.next( 2 ));
    }

    @Test
    public void test2() {
        Problem_900.RLEIterator p = new Problem_900.RLEIterator(new int[]{923381016,843,898173122,924,540599925,391,
                                                                          705283400,275,811628709,850,895038968,590,
                                                                          949764874,580,450563107,660,996257840,917,
                                                                          793325084,82});
        assertEquals(843, p.next( 612783106 ));
        assertEquals(924, p.next( 486444202 ));
        assertEquals(924, p.next( 630147341 ));
    }
}
