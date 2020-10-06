package com.zakcorp.hackerrank.problemsolving;

import java.util.Arrays;

/**
 * Created by Zakir Hussain B on 02/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class ElectronicsShop {
    public int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int expensive = Integer.MIN_VALUE;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive <= budget) {
                    expensive = Math.max(expensive, keyboard + drive);
                }
            }
        }
        return expensive;
    }
}