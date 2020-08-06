package com.zakcorp.leetcodemaster;

public class Problem_211 {
    static TrieNode root;
    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;
        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }
    public void addWord(String word) {
        TrieNode tNTemp = root;
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if( tNTemp.children[index] == null ) {
                tNTemp.children[index] = new TrieNode();
            }
            tNTemp = tNTemp.children[index];
        }
        tNTemp.isEndOfWord = true;
    }
    public boolean search(String word) {
        TrieNode tNTemp = root;
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if( tNTemp.children[index] == null )
                return false;
            tNTemp = tNTemp.children[index];
        }
        return ( tNTemp != null && tNTemp.isEndOfWord );
    }

    public static void main(String[] args) {
        root = new TrieNode();
        Problem_211 p = new Problem_211();
        p.addWord("there");
        p.addWord("their");
        System.out.println(p.search("there"));
    }
}
