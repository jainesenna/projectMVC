package com.zetcode.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("message")
@RequestScoped
public class Message {
    
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}