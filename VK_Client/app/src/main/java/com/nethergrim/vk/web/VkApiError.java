package com.nethergrim.vk.web;

import com.nethergrim.vk.models.WebError;

/**
 * @author Andrew Drobyazko - c2q9450@gmail.com - https://nethergrim.github.io on 04.09.15.
 */
public class VkApiError extends Error {

    private WebError mWebError;

    public VkApiError(WebError webError) {
        mWebError = webError;
    }

    public WebError getWebError() {
        return mWebError;
    }

    public void setWebError(WebError webError) {
        mWebError = webError;
    }

    @Override
    public String toString() {
        return "VkApiError{" +
                "mWebError=" + mWebError +
                '}';
    }
}
