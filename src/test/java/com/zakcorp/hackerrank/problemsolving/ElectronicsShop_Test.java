package com.zakcorp.hackerrank.problemsolving;

import com.zakcorp.hackerrank.problemsolving.ElectronicsShop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
public class ElectronicsShop_Test {
    ElectronicsShop p = new ElectronicsShop();
    @Test
    public void test1() {
        assertEquals(9, p.getMoneySpent(new int[]{3,1}, new int[]{5,2,8}, 10));
    }
}