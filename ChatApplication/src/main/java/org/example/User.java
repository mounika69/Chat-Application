package org.example;

import java.util.List;

public interface User{
    String getName();
    void sendMessage(String msg);
    void receiveMessage(User u,String msg);
}