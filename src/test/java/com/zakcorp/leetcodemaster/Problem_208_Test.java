package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Problem_208_Test {
    Problem_208.Trie p = new Problem_208.Trie();
    @Test
    public void test1() {
        p.insert("apple");
        assertTrue(p.search("apple"));
        assertFalse(p.search("app"));
        assertTrue(p.startsWith("app"));
        p.insert("app");
        assertTrue(p.search("app"));
    }
}
