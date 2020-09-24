package com.zakcorp.hackerrank;

/**
 * Created by Zakir Hussain B on 24/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class SavethePrisoner {
    // Complete the saveThePrisoner function below.
    public int saveThePrisoner(int n, int m, int s) {
        int x = (s - 1) + (m - 1);
        return (x % n) + 1;
    }
}