package org.example;

public class ChatApplication {
    public static void main(String[] args){
        ConcreteMediator m=new ConcreteMediator();

        User1 u1=new User1(m);
        m.registerUser(u1);
        u1.setName("Swathi");
        User1 u2=new User1(m);

        //u2.sendMessage("Hello",l);
        m.registerUser(u2);
        u2.setName("Priya");
        User1 u3=new User1(m);
        m.registerUser(u3);
        u3.setName("Shiva");
        u1.sendMessage("Hi");
        System.out.println("---------------");
        u2.sendMessage("Hello");


    }
}
