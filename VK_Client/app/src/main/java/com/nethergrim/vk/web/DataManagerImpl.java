package com.nethergrim.vk.web;

import android.text.TextUtils;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;
import com.nethergrim.vk.Constants;
import com.nethergrim.vk.MyApplication;
import com.nethergrim.vk.caching.Prefs;
import com.nethergrim.vk.data.PersistingManager;
import com.nethergrim.vk.models.ConversationsUserObject;
import com.nethergrim.vk.models.ListOfFriends;
import com.nethergrim.vk.models.ListOfUsers;
import com.nethergrim.vk.models.StartupResponse;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

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
public class DataManagerImpl implements DataManager {


    public static final String TAG = DataManager.class.getSimpleName();

    @Inject
    Prefs mPrefs;


    @Inject
    WebRequestManager mWebRequestManager;

    @Inject
    PersistingManager mPersistingManager;

    public DataManagerImpl() {
        MyApplication.getInstance().getMainComponent().inject(this);
    }

    @Override
    public Observable<StartupResponse> launchStartupTasksAndPersistToDb() {

        // prepare parameters
        String token = mPrefs.getGcmToken();
        if (TextUtils.isEmpty(token)) {
            InstanceID instanceID = InstanceID.getInstance(
                    MyApplication.getInstance().getApplicationContext());
            try {
                token = instanceID.getToken(Constants.GCM_SENDER_ID,
                        GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mPrefs.setGcmToken(token);
        }

        // make web request
        StartupResponse startupResponse = mWebRequestManager.launchStartupTasks(token);
        if (startupResponse.ok()) {
            mPersistingManager.manage(startupResponse);
        } else {
            // TODO: 30.08.15 handle errors
            Log.e(TAG, "error: " + startupResponse.getError().toString());
        }
        return Observable.just(startupResponse);
    }

    @Override
    public Observable<ListOfFriends> fetchFriendsAndPersistToDb(int count, int offset) {
        ListOfFriends listOfFriends = mWebRequestManager.getFriends(
                mPrefs.getCurrentUserId(), count, offset);
        if (listOfFriends.ok()) {
            mPersistingManager.manage(listOfFriends, offset);
        } else {
            // TODO: 30.08.15 handle errors
            Log.e(TAG, "error: " + listOfFriends.getError().toString());
        }

        return Observable.just(listOfFriends);
    }

    @Override
    public Observable<ListOfUsers> fetchUsersAndPersistToDB(List<Long> ids) {
        ListOfUsers listOfUsers = mWebRequestManager.getUsers(ids);
        if (listOfUsers.ok()) {
            mPersistingManager.manage(listOfUsers);
        } else {
            // TODO: 30.08.15 handle errors
            Log.e(TAG, "error: " + listOfUsers.getError().toString());
        }
        return Observable.just(listOfUsers);
    }

    @Override
    public Observable<ConversationsUserObject> fetchConversationsUserAndPersist(int limit,
            int offset,
            boolean unreadOnly) {
        ConversationsUserObject conversationsUserObject
                = mWebRequestManager.getConversationsAndUsers(limit, offset, unreadOnly);
        if (conversationsUserObject.ok()) {
            mPersistingManager.manage(conversationsUserObject);
        } else {
            // TODO: 30.08.15 handle errors
            Log.e(TAG, conversationsUserObject.getError().toString());
        }
        return Observable.just(conversationsUserObject);
    }
}