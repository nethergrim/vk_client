package com.nethergrim.vk.adapter;

import android.text.format.DateUtils;
import android.view.View;

import com.nethergrim.vk.MyApplication;
import com.nethergrim.vk.R;
import com.nethergrim.vk.adapter.viewholders.ChatViewHolder;
import com.nethergrim.vk.caching.Prefs;
import com.nethergrim.vk.models.Message;
import com.nethergrim.vk.models.User;
import com.nethergrim.vk.utils.UserProvider;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * {@link android.support.v7.widget.RecyclerView.Adapter} that should be used to display list of
 * messages in {@link com.nethergrim.vk.fragment.ChatFragment}
 *
 * @author Andrey Drobyazko (c2q9450@gmail.com).
 *         All rights reserved.
 */
public class ChatAdapter extends UltimateAdapter implements UltimateAdapter.HeaderInterface {

    public static final int TYPE_MY = 1;
    public static final int TYPE_NOT_MINE = 0;
    @Inject
    UserProvider mUserProvider;
    @Inject
    Prefs mPrefs;
    private RealmResults<Message> mMessages;

    // key - Long, user id, value = user;
    private Map<Long, User> mUsersMap;


    public ChatAdapter(long conversationId, boolean isAGroupChat) {
        MyApplication.getInstance().getMainComponent().inject(this);
        Realm realm = Realm.getDefaultInstance();
        setHasStableIds(true);
        mUsersMap = new HashMap<>();
        if (isAGroupChat) {
            mMessages = realm.where(Message.class)
                    .equalTo("chat_id", conversationId)
                    .findAllSorted("date", false);
        } else {
            mMessages = realm.where(Message.class)
                    .equalTo("user_id", conversationId)
                    .findAllSorted("date", false);
        }
    }


    @Override
    public int getDataSize() {
        return mMessages.size();
    }

    @Override
    public int getDataViewResId(int viewType) {
        switch (viewType) {
            case TYPE_MY:
                return R.layout.vh_chat_right;
            case TYPE_NOT_MINE:
                return R.layout.vh_chat_left;
            default:
                return 0;
        }
    }


    @Override
    public long getDataId(int dataPosition) {
        if (dataPosition >= mMessages.size()) {
            return -1;
        }
        return mMessages.get(dataPosition).getId();
    }

    @Override
    public int getDataViewType(int dataPosition) {
        if (dataPosition >= mMessages.size()) {
            return -5;
        }
        Message message = mMessages.get(dataPosition);
        return message.getOut() == 1 ? TYPE_MY : TYPE_NOT_MINE;
    }

    @Override
    public DataVH getDataViewHolder(View v, int dataViewType) {
        return new ChatViewHolder(v);
    }

    @Override
    public void bindDataVH(DataVH vh, int dataPosition) {
        ChatViewHolder chatViewHolder = (ChatViewHolder) vh;
        Message message = mMessages.get(dataPosition);
        User user = getUserById(message.getFrom_id());

        chatViewHolder.textBody.setText(message.getBody());
        chatViewHolder.imageAvatar.display(user, true);
        chatViewHolder.textDate.setText(
                DateUtils.getRelativeTimeSpanString(message.getDate() * 1000));
    }

    @Override
    public HeaderVH getHeaderVH(View v) {
        return new MyHeaderVH(v);
    }

    @Override
    public int getHeaderViewResId() {
        return R.layout.spinner;
    }

    @Override
    public void bindHeaderVH(HeaderVH vh) {
        // nothing here, just empty spinner
    }

    private User getUserById(long id) {
        User user = mUsersMap.get(id);
        if (user == null) {
            user = mUserProvider.getUser(id);
            mUsersMap.put(id, user);
        }
        return user;
    }

    public static class MyHeaderVH extends HeaderVH {

        public MyHeaderVH(View itemView) {
            super(itemView);
        }
    }
}
