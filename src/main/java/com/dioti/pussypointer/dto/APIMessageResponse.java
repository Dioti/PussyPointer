package com.dioti.pussypointer.dto;

import java.io.Serializable;

public class APIMessageResponse implements Serializable {
    private String message;

    public APIMessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
