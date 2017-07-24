package com.thesis.app.model;

/**
 * Created by Seppo on 30/06/2017.
 */
public class TextResponse {

    private String message;

    public TextResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
