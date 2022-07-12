package com.zakcorp.leetcodemaster;

public class Problem_208 {
    static class TrieNode {
        TrieNode[] children;
        boolean isEndWord;
        public TrieNode() {
            children = new TrieNode[26];
            isEndWord = false;
        }
    }
    static class Trie {
        private TrieNode root;
        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode curr = root;
            for(int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if(curr.children[index] == null) {
                    curr.children[index] = new TrieNode();
                }
                curr = curr.children[index];
            }
            curr.isEndWord = true;
        }

        public boolean search(String word) {
            TrieNode curr = root;
            for(int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if(curr.children[index] == null)
                    return false;
                curr = curr.children[index];
            }
            return curr != null && curr.isEndWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode curr = root;
            for(int i = 0; i < prefix.length(); i++) {
                int index = prefix.charAt(i) - 'a';
                if(curr.children[index] == null)
                    return false;
                curr = curr.children[index];
            }
            return true;
        }
    }
}
