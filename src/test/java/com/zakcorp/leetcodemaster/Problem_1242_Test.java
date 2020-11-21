package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;
import java.io.*;

import static org.junit.Assert.*;

public class Problem_1242_Test {
    Problem_1242.Solver p = new Problem_1242.Solver();
    Problem_1242.Solver1 p1 = new Problem_1242.Solver1();
    @Test
    public void test1() {
        HtmlParser htm = new HtmlParser(new String[]{"http://news.yahoo.com", "http://news.yahoo.com/news", "http://news.yahoo.com/news/topics/", "http://news.google.com", "http://news.yahoo.com/us"});
        htm.setUrls(new int[][]{{2,0}, {2,1}, {3,2}, {3,1}, {0,4}});
        List<String> expected = Arrays.asList("http://news.yahoo.com",
                "http://news.yahoo.com/news",
                "http://news.yahoo.com/news/topics/",
                "http://news.yahoo.com/us");
//        {
//            List<String> actual = p.crawl("http://news.yahoo.com/news/topics/", htm);
//            assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected) );
//        }
        {
            List<String> actual = p1.crawl("http://news.yahoo.com/news/topics/", htm);
            assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected) );
        }
    }
    @Test
    public void test2() {
        HtmlParser htm = new HtmlParser(new String[]{"http://news.yahoo.com", "http://news.yahoo.com/news", "http://news.yahoo.com/news/topics/", "http://news.google.com"});
        htm.setUrls(new int[][]{{0,2},{2,1},{3,2},{3,1},{3,0}});

        List<String> expected = Collections.singletonList("http://news.google.com");

        {
            List<String> actual = p.crawl("http://news.google.com", htm);
            assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected) );
        }
        {
            List<String> actual = p1.crawl("http://news.google.com", htm);
            assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected) );
        }
    }
}
