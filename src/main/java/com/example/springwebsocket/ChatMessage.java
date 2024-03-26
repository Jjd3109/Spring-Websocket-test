package com.example.springwebsocket;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    //메시지 타입 : 입장, 채팅
    public enum MessageType{
        ENTER, JOIN, TALK
    }
    private MessageType type;
    private String roomId;
    private String sender;
    private String message;


}
