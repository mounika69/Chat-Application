package org.example;

import java.util.ArrayList;
import java.util.List;

public class User1 implements User {
    String name;
    private Mediator m;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void sendMessage(String msg){
        this.m.showMessage(this,msg);
    }

    public User1(Mediator m)
    {
        this.m=m;
    }
    public void receiveMessage(User u, String msg)
    {
        System.out.println(u.getName()+" receives message : "+msg);
    }
}
