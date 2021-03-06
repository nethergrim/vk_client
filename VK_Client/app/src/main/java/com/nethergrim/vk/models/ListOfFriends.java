package com.nethergrim.vk.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Andrew Drobyazko - c2q9450@gmail.com - https://nethergrim.github.io on 15.08.15.
 */
public class ListOfFriends extends WebResponse {

    @JsonProperty("response")
    private FriendsResponse mResponse;

    public FriendsResponse getResponse() {
        return mResponse;
    }

    public void setResponse(FriendsResponse response) {
        mResponse = response;
    }

    public static class FriendsResponse {

        @JsonProperty("count")
        private int mCount;

        @JsonProperty("friends")
        private List<User> mFriends;

        public int getCount() {
            return mCount;
        }

        public void setCount(int count) {
            mCount = count;
        }

        public List<User> getFriends() {
            return mFriends;
        }

        public void setFriends(List<User> friends) {
            mFriends = friends;
        }
    }

}
