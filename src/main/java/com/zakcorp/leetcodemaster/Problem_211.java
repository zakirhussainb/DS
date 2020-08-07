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
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if( curr.children[index] == null ) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if( curr.children[index] == null )
                return false;
            curr = curr.children[index];
        }
        return ( curr != null && curr.isEndOfWord );
    }

    public static void main(String[] args) {
        root = new TrieNode();
        Problem_211 p = new Problem_211();
        p.addWord("there");
        p.addWord("their");
        p.addWord("theirs");
        System.out.println(p.search("there"));
        System.out.println(p.search("the"));
    }
}
