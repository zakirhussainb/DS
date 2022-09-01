package com.zakcorp.leetcodemaster.crawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class LeetCodeCrawler
{
    public static void main( String[] args ) throws IOException
    {
        LeetCodeCrawler lc = new LeetCodeCrawler();
        // Main Page crawl
        lc.mainPage();
    }

    private void mainPage() throws IOException
    {
        URL url = new URL( "https://leetcode.com/" );
        HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
        
    }
}
