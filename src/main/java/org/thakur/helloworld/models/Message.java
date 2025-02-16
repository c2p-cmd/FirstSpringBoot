package org.thakur.helloworld.models;

public class Message {
    private String message;
    private int num;

    public Message(String message, int num) {
        this.message = message;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
