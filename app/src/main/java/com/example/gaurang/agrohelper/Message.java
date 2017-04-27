package com.example.gaurang.agrohelper;


public class  Message {
    private String message;
    private String sender;

    public Message() {
    }
    public String getmessage(){return message;}
    public String getsender(){return sender;}


    public void setMessage(String message){this.message= message;}
    public void setSender(String sender) {
        this.sender = sender;
    }
}
