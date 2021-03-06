package com.nethergrim.vk.utils;

import android.support.annotation.NonNull;

import com.nethergrim.vk.models.Conversation;
import com.nethergrim.vk.models.Message;

import java.util.ArrayList;

/**
 * @author Andrew Drobyazko - c2q9450@gmail.com - https://nethergrim.github.io on 14.08.15.
 */
public class DataHelper {

    /**
     * This method should be called for every ConversationsList received from the backend.
     * It will generate ID for conversation, add Date field (from the last message), and normalize
     * messages;
     */
    public static ArrayList<Conversation> normalizeConversationsList(
            @NonNull ArrayList<Conversation> conversationsList) {
        for (int i = 0, size = conversationsList.size(); i < size; i++) {
            Conversation conversation = conversationsList.get(i);

            // setting date to the conversation
            conversation.setDate(conversation.getMessage().getDate());

            // setting conversation id
            if (ConversationUtils.isConversationAGroupChat(conversation)) {
                conversation.setId(conversation.getMessage().getChat_id());
            } else {
                conversation.setId(conversation.getMessage().getUser_id());
            }
            conversation.setMessage(normalizeMessage(conversation.getMessage()));
        }

        return conversationsList;
    }

    /**
     * This method should be called for every Message received from the backend.
     * It will generate AuthorId, to optimize and simplify data usage.
     */
    public static Message normalizeMessage(@NonNull Message message) {

        return message;
    }
}
