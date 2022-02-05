package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_355 {
    static class Pair {
        int time;
        int tweetId;
        public Pair(int time, int tweetId) {
            this.time = time;
            this.tweetId = tweetId;
        }
    }

    Map<Integer, LinkedList<Pair>> userToTweetMap;
    Map<Integer, Set<Integer>> followerToFollowMap;
    PriorityQueue<Pair> pq;
    int timer;

    public Problem_355() {
        userToTweetMap = new HashMap<>();
        followerToFollowMap = new HashMap<>();
        pq = new PriorityQueue<>();
        timer = 0;
    }

    public void postTweet(int userId, int tweetId) {
        if( !followerToFollowMap.containsKey( userId ) )
            followerToFollowMap.put( userId, new HashSet<>() );
        followerToFollowMap.get(userId).add(userId);

        if ( !userToTweetMap.containsKey(userId) ) {
            userToTweetMap.put(userId, new LinkedList<>());
        }
        userToTweetMap.get(userId).addFirst(new Pair(timer++, tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        if( !followerToFollowMap.containsKey(userId) )
            followerToFollowMap.put(userId, new HashSet<>());
        PriorityQueue<Pair> feed = new PriorityQueue<>( (t1, t2) -> t2.time - t1.time);
        for(Map.Entry<Integer, Set<Integer>> entry : followerToFollowMap.entrySet())
        {
            if(entry.getKey() == userId)
            {
                for(Integer key : entry.getValue()) {
                    if(userToTweetMap.containsKey(key))
                    {
                        feed.addAll(userToTweetMap.get(key));
                    }
                }
            }

        }
        List<Integer> recentNewsFeed = new LinkedList<>();
        while (feed.size() > 0 && recentNewsFeed.size() < 10)
            recentNewsFeed.add(feed.poll().tweetId);
        return recentNewsFeed;
    }

    public void follow(int followerId, int followeeId) {
        if( !followerToFollowMap.containsKey( followerId ) ) {
            followerToFollowMap.put( followerId, new HashSet<>() );
        }
        followerToFollowMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if( followerToFollowMap.containsKey( followerId ) && followerId != followeeId ) {
            followerToFollowMap.get(followerId).remove(followeeId);
        }
    }
}
