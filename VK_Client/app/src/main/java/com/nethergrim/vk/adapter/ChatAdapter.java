package com.nethergrim.vk.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nethergrim.vk.MyApplication;
import com.nethergrim.vk.R;
import com.nethergrim.vk.adapter.viewholders.ChatViewHolder;
import com.nethergrim.vk.images.ImageLoader;
import com.nethergrim.vk.models.Message;
import com.nethergrim.vk.utils.UserProvider;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * @author Andrey Drobyazko (c2q9450@gmail.com).
 *         All rights reserved.
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolder> {

    @Inject
    ImageLoader mImageLoader;
    @Inject
    UserProvider mUserProvider;
    private RealmResults<Message> mMessages;

    public ChatAdapter(long conversationId, boolean isAGroupChat) {
        MyApplication.getInstance().getMainComponent().inject(this);
        Realm realm = Realm.getDefaultInstance();
        if (isAGroupChat) {
            mMessages = realm.where(Message.class)
                    .equalTo("chat_id", conversationId)
                    .findAllSorted("date");
        } else {
            mMessages = realm.where(Message.class)
                    .equalTo("user_id", conversationId)
                    .findAllSorted("date");
        }
    }

    @Override
    public ChatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if (isMessageFromMe(viewType)) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.vh_chat_right, parent, false);
        } else {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.vh_chat_left, parent, false);
        }
        ChatViewHolder chatViewHolder = new ChatViewHolder(v);
        return chatViewHolder;
    }

    @Override
    public void onBindViewHolder(ChatViewHolder holder, int position) {
        Message message = mMessages.get(position);

        holder.textBody.setText(message.getBody());
        boolean isMine = isMessageFromMe(position);
        if (isMine) {
            mImageLoader.displayUserAvatar(mUserProvider.getMyUser(), holder.imageAvatar);
        } else {
            mImageLoader.displayUserAvatar(mUserProvider.getUser(message.getFrom_id()),
                    holder.imageAvatar);
        }
        if (position > 0) {
            if ((isMine && isMessageFromMe(position - 1)) || (
                    !isMine && (message.getFrom_id() == mMessages.get(position - 1)
                            .getFrom_id()))) {
                holder.imageAvatar.setVisibility(View.INVISIBLE);
            } else {
                holder.imageAvatar.setVisibility(View.VISIBLE);
            }
        }

    }

    @Override
    public int getItemViewType(int position) {
        return mMessages.get(position).getOut();
    }

    @Override
    public int getItemCount() {
        return mMessages.size();
    }

    private boolean isMessageFromMe(int position) {
        return getItemViewType(position) == 1;
    }
}