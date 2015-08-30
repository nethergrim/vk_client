package com.nethergrim.vk.web;

import com.nethergrim.vk.models.ConversationsUserObject;
import com.nethergrim.vk.models.ListOfFriends;
import com.nethergrim.vk.models.ListOfUsers;
import com.nethergrim.vk.models.StartupResponse;

import rx.Observable;

/**
 * Class that will handle results of every web request. Should be used to map, persist data, and
 * notify UI thread to be updated.
 * <p>
 * This should be the only way to handle web requests results.
 * <p>
 * By default every method of current class should return {@link rx.Observable} as result.
 *
 * @author andrej on 30.08.15 (c2q9450@gmail.com).
 *         All rights reserved.
 */
public class DataManagerImpl implements DataManager{

    @Override
    public Observable<StartupResponse> launchStartupTasksAndPersistToDb() {
        return null;
    }

    @Override
    public Observable<ListOfFriends> fetchFriendsAndPersistToDb(int count, int offset) {
        return null;
    }

    @Override
    public Observable<ListOfUsers> fetchUsersAndPersistToDB(long[] ids) {
        return null;
    }

    @Override
    public Observable<ConversationsUserObject> fetchConversationsUserAndPersist(int limit,
            int offset,
            boolean unreadOnly) {
        return null;
    }
}
