package me.whiteship.java8to11;

public class App extends SmartPhone{
    public App(String str) {
        super(str);
    }

    @Override
    public void receive() {
        System.out.println("A사 전화받기");
    }

    @Override
    public void send() {
        System.out.println("A사 전화걸기");
    }

    @Override
    public void internet() {
       System.out.println("A사 인터넷 사용");
    }

}
