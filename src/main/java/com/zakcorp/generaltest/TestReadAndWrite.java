package com.zakcorp.generaltest;

public class TestReadAndWrite {
    public static void main(String[] args) {
        String requestURI = "/webapps/portal/js/achievement.js/jsp/page";
        if( requestURI.matches( loadHeaderExclusionRegex() ) )
        {
            System.out.println("res...doesn't add header to response...");
        } else {
            System.out.println("res...add header to response...");
        }
    }
    private static String loadHeaderExclusionRegex()
    {
        return ".*/js/originality-report.min.*|.*/js/achievement.js.*";
    }
}
