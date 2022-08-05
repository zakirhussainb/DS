package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_341 {
    static interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }
    static class NestedIterator implements Iterator<Integer> {
        Stack<NestedInteger> stack;
        public NestedIterator(List<NestedInteger> nestedList) {
            stack = new Stack<>();
            prepareStack(nestedList);
        }
        @Override
        public boolean hasNext() {
            while ( !stack.isEmpty() && !stack.peek().isInteger() ) {
                List<NestedInteger> list = stack.pop().getList();
                prepareStack(list);
            }
            return !stack.isEmpty();
        }

        @Override
        public Integer next() {
            if(!hasNext()) {
                return null;
            }
            return stack.pop().getInteger();
        }

        private void prepareStack(List<NestedInteger> nestedList) {
            for(int i = nestedList.size() - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }
        }
    }
}
