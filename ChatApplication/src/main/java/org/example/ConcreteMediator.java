package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    List<User1> l=new ArrayList<>();
    public void registerUser(User1 u)
    {
        l.add(u);
    }
    @Override
    public void showMessage(User user, String message) {
        System.out.println(user.getName()+" sends message : "+message);
        for(User1 u : l)
        {
            if(!(u.getName().equals(user.getName())))
                u.receiveMessage(u,message);
        }

    }
}
