package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_5382_Test {
    @Test
    public void test1() {
        Problem_5382 p = new Problem_5382();
        assertEquals("& is an HTML entity but &ambassador; is not.",
                p.entityParser("&amp; is an HTML entity but &ambassador; is not."));
    }
    @Test
    public void test2() {
        Problem_5382 p = new Problem_5382();
        assertEquals("and I quote: \"...\"",
                p.entityParser("and I quote: &quot;...&quot;"));
    }
    @Test
    public void test3() {
        Problem_5382 p = new Problem_5382();
        assertEquals("Stay home! Practice on Leetcode :)",
                p.entityParser("Stay home! Practice on Leetcode :)"));
    }
    @Test
    public void test4() {
        Problem_5382 p = new Problem_5382();
        assertEquals("x > y && x < y is always false",
                p.entityParser("x &gt; y &amp;&amp; x &lt; y is always false"));
    }
    @Test
    public void test5() {
        Problem_5382 p = new Problem_5382();
        assertEquals("leetcode.com/problemset/all",
                p.entityParser("leetcode.com&frasl;problemset&frasl;all"));
    }

}
