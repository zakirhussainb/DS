package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_C_Test {

    @Test
    public void test1() {
        Problem_C.FoodRatings p = new Problem_C.FoodRatings( new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"}, new int[]{9, 12, 8, 15, 14, 7});
        assertEquals("kimchi", p.highestRated("korean"));
        assertEquals("ramen", p.highestRated("japanese"));
        p.changeRating("sushi", 16);
        assertEquals("sushi", p.highestRated("japanese"));
        p.changeRating("ramen", 16);
        assertEquals("ramen", p.highestRated("japanese"));
    }
}
