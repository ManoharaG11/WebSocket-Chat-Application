package com.manu.chat;

public class ChatNotification {
    private String type; // "JOIN" or "LEAVE"
    private String user;
    private String timestamp;

    public ChatNotification() {}

    public ChatNotification(String type, String user, String timestamp) {
        this.type = type;
        this.user = user;
        this.timestamp = timestamp;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
