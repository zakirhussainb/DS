package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1797
{
    static class AuthenticationManager {

        static class TokenInfo {
            private String tokenId;
            private int tokenGeneratedTime;
            private int tokenExpirationTime;

            public TokenInfo( String tokenId, int tokenGeneratedTime, int tokenExpirationTime )
            {
                this.tokenId = tokenId;
                this.tokenGeneratedTime = tokenGeneratedTime;
                this.tokenExpirationTime = tokenExpirationTime;
            }
        }
        private int timeToLive;
        private Map<String, TokenInfo> map;
        public AuthenticationManager(int timeToLive) {
            this.timeToLive = timeToLive;
            map = new HashMap<>();
        }

        public void generate(String tokenId, int currentTime) {
            TokenInfo tokenInfo = new TokenInfo(tokenId, currentTime, currentTime + timeToLive);
            map.put(tokenId, tokenInfo);
        }

        public void renew(String tokenId, int currentTime) {
            if(map.containsKey( tokenId )) {
                int tokenExpirationTime = map.get( tokenId ).tokenExpirationTime;
                if(currentTime < tokenExpirationTime) {
                    map.get( tokenId ).tokenGeneratedTime = currentTime;
                    map.get( tokenId ).tokenExpirationTime = currentTime + timeToLive;
                }
            }
        }

        public int countUnexpiredTokens(int currentTime) {
            int unexpiredToken = 0;
            for(Map.Entry<String, TokenInfo> entry : map.entrySet()) {
                if(currentTime < entry.getValue().tokenExpirationTime) {
                    unexpiredToken++;
                }
            }
            return unexpiredToken;
        }
    }
}
